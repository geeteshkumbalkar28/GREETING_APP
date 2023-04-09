package com.bridgelabz.GreetingApp.dto;

public class GreetingDTO {
    public String firstName;
    public String lastName;

    @Override
    public String toString() {
        return "GreetingDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
