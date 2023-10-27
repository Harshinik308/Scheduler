package com.example.Scheduler_output.controller;

import com.example.Scheduler_output.model.Output;
import com.example.Scheduler_output.service.OutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/scheduler_output")
public class OutputController {
    @Autowired
    OutputService outputService;

    @GetMapping
    public List<Output> getAllDetails(){
        return outputService.getAll();
    }

    @GetMapping("/{Id}")
    public Output getOneDetail(@PathVariable Integer Id){
        return outputService.getOne(Id);
    }

    @PostMapping
    public String putAllDetails(@RequestBody Output output){
        this.outputService.putAll(output);
        return "Created Successfully";
    }
    @DeleteMapping
    public  String deletealldetails(){
        this.outputService.deleteall();
        return "Deleted Successfully";
    }

}
