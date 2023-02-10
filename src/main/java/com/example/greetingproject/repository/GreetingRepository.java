package com.example.greetingproject.repository;


import com.example.greetingproject.model.GreetingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<GreetingModel, Long> {

}