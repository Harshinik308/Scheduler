package com.example.Tournament_scheduler.controller;

import com.example.Tournament_scheduler.model.Scheduler;
import com.example.Tournament_scheduler.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/scheduler")
public class SchedulerController {
    @Autowired
    private SchedulerService schedulerService;

    @PostMapping
    public String createController(@RequestBody Scheduler scheduler) {
        schedulerService.Creating(scheduler);
        return "Created";
    }

    @GetMapping
    public List<Scheduler> getAllController() {
        return schedulerService.gettingAll();
    }

    @GetMapping("/{id}")
    public Scheduler getController(@PathVariable Integer id) {
        return schedulerService.getting(id);
    }

    @DeleteMapping("/{id}")
    public String deleteController(@PathVariable Integer id){
        return  schedulerService.deleting(id);
    }
}
