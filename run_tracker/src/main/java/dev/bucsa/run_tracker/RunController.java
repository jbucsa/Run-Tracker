package dev.bucsa.run_tracker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunController {
    @RequestMapping("/hello")
    String home(){
        return "Hello, Runners!!! Lets start";
    }
}