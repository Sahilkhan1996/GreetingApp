package com.example.greetingproject.controller;

import com.example.greetingproject.model.GreetingModel;
import com.example.greetingproject.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @GetMapping("/getmessage") //GET http://localhost:8080/getmessage
    public String getGreeting() {
        return greetingService.getGreeting();
    }

    @PostMapping("/addingGreet") //POST http://localhost:8080/addingGreet JSON {"firstName":"Ankit","lastName":"Thakur"}
    public GreetingModel addingGreet(@RequestBody GreetingModel greetingModel) {
        return greetingService.addingGreet(greetingModel);
    }

    @GetMapping("/getrow/{id}")
    public GreetingModel RetrieveGreet(@PathVariable long id) {
        return greetingService.retriveId(id);
    }

    @GetMapping("/getGreets")
    public List<GreetingModel> getGreet() {
        return greetingService.getGreets();
    }

    @PutMapping("/putGreet/{id}")
    public GreetingModel updateGreetById(@PathVariable long id, @RequestBody GreetingModel greetingModel) {
        return greetingService.updateGreet(id, greetingModel);
    }

    @DeleteMapping("/deleteGreet/{id}")
    public void deleteGreetById(@PathVariable long id) {
        greetingService.deleteGreet(id);
    }
}
