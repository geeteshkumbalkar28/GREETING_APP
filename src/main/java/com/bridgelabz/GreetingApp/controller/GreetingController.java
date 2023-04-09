package com.bridgelabz.GreetingApp.controller;

import com.bridgelabz.GreetingApp.dto.GreetingDTO;
import com.bridgelabz.GreetingApp.model.User;
import com.bridgelabz.GreetingApp.repository.IGreetingRepo;
import com.bridgelabz.GreetingApp.services.GreetingImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GreetingController {
    @Autowired
    private IGreetingRepo iGreetingRepo;
    @GetMapping("/")
    public String message(){
        GreetingImp greetingImp = new GreetingImp();
        return greetingImp.message();
    }
    @PostMapping("/message")
    public String messageOne(@RequestBody GreetingDTO greetingDTO){
        GreetingImp greetingImp = new GreetingImp();
        return greetingImp.message(greetingDTO);
    }
    @PostMapping("/save")
    public User addUser(@RequestBody GreetingDTO greetingDTO){
        User user = new User(greetingDTO);
        return iGreetingRepo.save(user);
    }
    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable int id){

        Optional<User> userData = iGreetingRepo.findById(id);
        if(userData.isPresent())
        {
            return userData;

        }
        return null;
    }
    @GetMapping("/AllDisplay")
    public List<User> DisplayAll(){
        GreetingImp greetingImp = new GreetingImp();

        return greetingImp.getAllUser(iGreetingRepo);
    }
    @PutMapping("Edit/{id}")
    public User editUser(@RequestBody GreetingDTO greetingDTO, @PathVariable int id){
        Optional<User> userData = iGreetingRepo.findById(id);
        if(userData.isPresent())
        {
            GreetingImp greetingImp = new GreetingImp();
            return greetingImp.update(greetingDTO,userData,iGreetingRepo);

        }
        return null;
    }
    @DeleteMapping("/Delete/{id}")
    public String deleteUser(@PathVariable int id){
        Optional<User> userData = iGreetingRepo.findById(id);
        if(userData.isPresent())
        {
            iGreetingRepo.deleteById(id);
            return "Message Delete succesfully ";
        }
        return "id not found";
    }
}
