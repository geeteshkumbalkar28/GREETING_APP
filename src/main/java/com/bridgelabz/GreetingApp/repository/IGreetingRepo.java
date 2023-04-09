package com.bridgelabz.GreetingApp.repository;

import com.bridgelabz.GreetingApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IGreetingRepo extends JpaRepository <User,Integer >{
}
