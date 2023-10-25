package com.example.Tournament_scheduler.service;

import com.example.Tournament_scheduler.model.Scheduler;
import com.example.Tournament_scheduler.repository.SchedulerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SchedulerService {
    @Autowired
    SchedulerRepository schedulerRepository;
    public String Creating(Scheduler s){
        this.schedulerRepository.save(s);
        return "Created !!!";
    }
    public List<Scheduler> gettingAll(){
        return this.schedulerRepository.findAll();
    }
    public Scheduler getting(Integer id){
        return this.schedulerRepository.findById(id).get();
    }
    public String deleting(Integer id){
       this.schedulerRepository.deleteById(id);
       return "Deleted";
    }
}
