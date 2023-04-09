package com.bridgelabz.GreetingApp.services;

import com.bridgelabz.GreetingApp.dto.GreetingDTO;
import com.bridgelabz.GreetingApp.model.User;
import com.bridgelabz.GreetingApp.repository.IGreetingRepo;

import java.util.List;
import java.util.Optional;

public class GreetingImp {
    public String message(){
        return "Hello world";
    }
    public String message(GreetingDTO greetingDTO){
        if((greetingDTO.firstName)==null && (greetingDTO.lastName)==null ){
            return "Hello World";
        }
        else if((greetingDTO.firstName)==null){
            return greetingDTO.lastName;
        }
        else if((greetingDTO.lastName)==null){
            return greetingDTO.firstName;
        }
        else
        {
            return greetingDTO.toString();
        }

    }
    public List<User> getAllUser(IGreetingRepo iGreetingRepo){
        List<User> userData = iGreetingRepo.findAll();

        return userData;



    }
}
