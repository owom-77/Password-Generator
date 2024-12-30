package com.example.demo.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class PasswordGeneratorService {

    public String generatePassword(String firstName, String middleName, String lastName) {
        
        String firstNamePart = firstName.length() >= 2 ? firstName.substring(0, 2) : firstName;
        String middleNamePart = middleName.length() >= 2 ? middleName.substring(0, 2) : middleName;
        String lastNamePart = lastName.length() >= 2 ? lastName.substring(0, 2) : lastName;

        Random random = new Random();
        int randomNumber = 100 + random.nextInt(900); 

        return firstNamePart + middleNamePart + lastNamePart + randomNumber;
    }
}
