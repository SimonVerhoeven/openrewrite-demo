package dev.simonverhoeven.openrewritedemo.oldorgname;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable("name") String name) {
        return "Hello " + name;
    }
}
