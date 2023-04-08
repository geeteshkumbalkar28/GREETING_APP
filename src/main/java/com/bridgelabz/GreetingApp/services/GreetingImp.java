package com.bridgelabz.GreetingApp.services;

import com.bridgelabz.GreetingApp.dto.GreetingDTO;

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
//    public String getAllUser(GreetingDTO greetingDTO,long countUser){
//        String Users = null;
//       for(int i=0;i<((int)countUser);i++)
//       {
//           Users = Users +" "+greetingDTO.toString();
//       }
//           return Users;
//    }
}


