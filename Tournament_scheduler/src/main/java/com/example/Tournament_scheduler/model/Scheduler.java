package com.example.Tournament_scheduler.model;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
@CrossOrigin("http://localhost:4200")
@Entity
@Table(name="Scheduler_input")
public class Scheduler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Team_1;
    private String Team_2;
    private String Team_3;
    private String Team_4;
    private String Team_5;
    private String Team_6;
    private Integer Number;
    private Date date;

    public Scheduler(Integer id, String team_1, String team_2, String team_3, String team_4, String team_5, String team_6, Integer number, Date date) {
        this.id = id;
        Team_1 = team_1;
        Team_2 = team_2;
        Team_3 = team_3;
        Team_4 = team_4;
        Team_5 = team_5;
        Team_6 = team_6;
        Number = number;
        this.date = date;
    }

    public Scheduler() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeam_1() {
        return Team_1;
    }

    public void setTeam_1(String team_1) {
        Team_1 = team_1;
    }

    public String getTeam_2() {
        return Team_2;
    }

    public void setTeam_2(String team_2) {
        Team_2 = team_2;
    }

    public String getTeam_3() {
        return Team_3;
    }

    public void setTeam_3(String team_3) {
        Team_3 = team_3;
    }

    public String getTeam_4() {
        return Team_4;
    }

    public void setTeam_4(String team_4) {
        Team_4 = team_4;
    }

    public String getTeam_5() {
        return Team_5;
    }

    public void setTeam_5(String team_5) {
        Team_5 = team_5;
    }

    public String getTeam_6() {
        return Team_6;
    }

    public void setTeam_6(String team_6) {
        Team_6 = team_6;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer number) {
        Number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
