package com.example.greetingproject.service;

import com.example.greetingproject.model.GreetingModel;
import com.example.greetingproject.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    GreetingRepository greetingRepository;

    // getting input from the controller and  returning the hello world
    public String getGreeting() {
        return "Hello World!";
    }

    // Adding id,firstname, lastname in the db by giving object as parameter to the save method
    public GreetingModel addingGreet(GreetingModel greetingModel) {
        return greetingRepository.save(greetingModel);
    }

    // retrieving the rows from the db with the id by using findById method by giving id as parameter
    public GreetingModel retriveId(long id) {
        GreetingModel GreetingModel = null;
        return greetingRepository.findById(id).orElse(GreetingModel);
    }

    // Retrieving all the rows from the db wih findall method
    public List<GreetingModel> getGreets() {
        return greetingRepository.findAll();
    }

    // Updating the rows in the db by taking input from the user i.e id and first Name and last name and
    // then retrieving the row with the setId method
    // and then updating the firstName and lastName in the row with the save method
    public GreetingModel updateGreet(long id, GreetingModel greetingModel) {
        greetingModel.setId(id);
        return greetingRepository.save(greetingModel);
    }

    // Deleting the row with the deleteById method by giving id as parameter
    public void deleteGreet(long id) {
        greetingRepository.deleteById(id);
    }
}
