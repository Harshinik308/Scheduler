package com.example.Scheduler_output.repository;

import com.example.Scheduler_output.model.Output;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Outputrepo extends JpaRepository<Output, Integer> {
}
