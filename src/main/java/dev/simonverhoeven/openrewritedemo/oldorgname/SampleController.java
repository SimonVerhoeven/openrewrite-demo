package dev.simonverhoeven.openrewritedemo.oldorgname;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.collect.Lists;
import com.google.common.math.IntMath;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {
    private static final int MAX_LOANABLE_BOOKS = 10;
    Logger logger = Logger.getLogger(SampleController.class);
    @Autowired
    private SampleService sampleService;

    @RequestMapping(method = RequestMethod.GET, value = "/greet/{name}")
    public String greet(@PathVariable("name") String name) {
        logger.info("We're responding to " + name);
        return "Hello " + name;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/remainingLoanableBooks/{name}")
    public int remainingLoanableBooks(@PathVariable("name") String name) {
        Optional<List<String>> loanedBooks = sampleService.getBooks(name);
        if (loanedBooks.isPresent()) {
            return IntMath.checkedSubtract(MAX_LOANABLE_BOOKS, loanedBooks.get().size());
        }
        return 0;
    }
}
