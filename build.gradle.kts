plugins {
    `java-library`
    `maven-publish`
    id("org.openrewrite.rewrite") version "6.3.16"
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    api("org.springframework.boot:spring-boot-starter:2.7.13")
    api("org.springframework.boot:spring-boot-starter-web:2.7.13")
    api("log4j:log4j:1.2.17")
    api("com.google.guava:guava:20.0")
    testImplementation("org.hamcrest:hamcrest:2.2")
    testImplementation("junit:junit:4.13.2")
    rewrite(platform("org.openrewrite.recipe:rewrite-recipe-bom:2.3.0"))
    rewrite("org.openrewrite.recipe:rewrite-testing-frameworks")
    rewrite("org.openrewrite.recipe:rewrite-spring")
    rewrite("org.openrewrite.recipe:rewrite-migrate-java")
    rewrite("org.openrewrite.recipe:rewrite-static-analysis")
}

group = "dev.simonverhoeven"
version = "0.0.1-SNAPSHOT"
description = "openrewritedemo"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}

rewrite {
    activeRecipe(
//            "org.openrewrite.java.RemoveUnusedImports",
//            "dev.simonverhoeven.sampleRecipe",
//            "org.openrewrite.java.testing.junit5.JUnit4to5Migration",
//            "org.openrewrite.java.spring.boot3.UpgradeSpringBoot_3_1",
//            "org.openrewrite.java.migrate.guava.NoGuava",
//            "org.openrewrite.java.testing.hamcrest.MigrateHamcrestToAssertJ",
//            "org.openrewrite.staticanalysis.CommonStaticAnalysis",
    )
}
