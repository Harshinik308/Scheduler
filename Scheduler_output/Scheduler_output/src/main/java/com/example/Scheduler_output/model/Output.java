package com.example.Scheduler_output.model;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
@CrossOrigin("http://localhost:4200")
@Entity
@Table(name="Scheduler_output")
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String Combination;
    private Date date;

    public Output() {
    }

    public Output(Integer id, String combination, Date date) {
        Id = id;
        Combination = combination;
        this.date = date;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCombination() {
        return Combination;
    }

    public void setCombination(String combination) {
        Combination = combination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
