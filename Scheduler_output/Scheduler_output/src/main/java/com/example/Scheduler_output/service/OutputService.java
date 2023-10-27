package com.example.Scheduler_output.service;

import com.example.Scheduler_output.model.Output;
import com.example.Scheduler_output.repository.Outputrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@CrossOrigin("http://localhost:4200")
@Service
public class OutputService {
    @Autowired
    private Outputrepo outputrepo;

    public List<Output> getAll(){
        return this.outputrepo.findAll();
    }
    public Output getOne(Integer id){
        return this.outputrepo.findById(id).get();
    }
    public String putAll(Output output){
        this.outputrepo.save(output);
        return "Success";
    }
    public String deleteall(){
        this.outputrepo.deleteAll();
        return "deleted";
    }

}
