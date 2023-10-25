package com.example.Tournament_scheduler.repository;

import com.example.Tournament_scheduler.model.Scheduler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulerRepository extends JpaRepository<Scheduler,Integer> {
}
