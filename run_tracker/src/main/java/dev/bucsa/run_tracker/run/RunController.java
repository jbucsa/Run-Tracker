package dev.bucsa.run_tracker.run;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunController {
    // @RequestMapping("/hello")
    // String home(){
    //     return "Hello, Runners!!! Lets start";
    
    private final RunRepository runRepository;

    public RunController(RunRepository runRepository){
        this.runRepository = runRepository;
    }   

    @GetMapping("/api/runs")
    List<Run> findAll(){
        return runRepository.findAll();
    }
}