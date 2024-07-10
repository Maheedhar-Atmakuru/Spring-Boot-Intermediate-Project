package com.example.jpa.controllers;



import com.example.jpa.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//    @GetMapping(path = "/getmymessage")
//    public String getMySuperSecretMessage(){
//        return "Secret message: This is my first get message";
//    }

    @GetMapping(path = "/{employeeID}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeID") Long employeeId){
        return new EmployeeDTO(employeeId, "Mahee", "mahidhar.mahi030@gmail.com", 27, LocalDate.of(2024, 2, 1), true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false) Integer age,
                                  @RequestParam(required = false) String sortBy){
        return "Hi age" + age+ " "+ sortBy;
    }

}
