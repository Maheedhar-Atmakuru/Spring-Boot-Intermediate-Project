package com.example.jpa.controllers;



import com.example.jpa.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EmployeeController {

//    @GetMapping(path = "/getmymessage")
//    public String getMySuperSecretMessage(){
//        return "Secret message: This is my first get message";
//    }

    @GetMapping(path = "/employees/{employeeID}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeID){
        return new EmployeeDTO(employeeID, "Mahee", "mahidhar.mahi030@gmail.com", 27, LocalDate.of(2024, 2, 1), true);
    }

    @GetMapping(path = "/employees")
    public String getAllEmployees(@RequestParam Integer age){
        return "Hi age" + age;
    }

}
