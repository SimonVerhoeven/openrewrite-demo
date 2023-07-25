package dev.simonverhoeven.openrewritedemo.oldorgname;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    Logger logger = Logger.getLogger(SampleController.class);

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable("name") String name) {
        logger.info("We're responding to " + name);
        return "Hello " + name;
    }
}
