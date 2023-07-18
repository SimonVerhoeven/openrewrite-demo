package dev.simonverhoeven.openrewritedemo;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;

@Category(DemoTag.class)
public class JunitTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @BeforeClass
    public static void initialSetup() {
        System.out.println("Important preparation before all test methods in the current class");
    }

    @AfterClass
    public static void finalCleanup() {
        System.out.println("Important cleanup after all test methods in the current class");
    }

    @Before
    public void beforeEachTest() {
    }

    @After
    public void afterEachTest() {
    }

    @Ignore
    public void importantTest() {
        // validate
    }

    @Test(timeout = 100)
    public void timeoutTest() throws InterruptedException {
        Thread.sleep(1_000);
    }

    @Test
    public void assertTest() {
        String expected = "Simon";
        Assert.assertEquals("Because Simon says so", expected, "Simon");
    }

    @Test(expected = Exception.class)
    public void shouldRaiseAnException() throws Exception {
        folder.newFile("somefile.txt");
        throw new IOException("expected exception");
    }

    @Test
    public void shouldRaiseAnIOException() throws Exception {
        expectedException.expect(IOException.class);
        throw new IOException("expected exception");
    }

}

interface DemoTag {}
