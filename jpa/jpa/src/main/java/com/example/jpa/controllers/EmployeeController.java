package com.example.jpa.controllers;



import com.example.jpa.dto.EmployeeDTO;
import com.example.jpa.entities.EmployeeEntity;
//import com.example.jpa.repositories.EmployeeRepository;
import com.example.jpa.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//    private EmployeeRepository employeeRepository;
//
//    public EmployeeController(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }

    private EmployeeService employeeService;

    public EmployeeController (EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //    @GetMapping(path = "/getmymessage")
//    public String getMySuperSecretMessage(){
//        return "Secret message: This is my first get message";
//    }

//    @GetMapping(path = "/{employeeID}")
//    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeID") Long employeeId){
//        return new EmployeeDTO(employeeId, "Mahee", "mahidhar.mahi030@gmail.com", 27, LocalDate.of(2024, 2, 1), true);
//    }

    @GetMapping(path = "/{employeeID}")
    public EmployeeEntity getEmployeeById(@PathVariable(name = "employeeID") Long employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @GetMapping
    public List<EmployeeEntity> getAllEmployees(@RequestParam(required = false) Integer age,
                                                @RequestParam(required = false) String sortBy){
        return employeeService.getAllEmployees();
    }

//    @PostMapping
//    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO inputEmployee){
//         inputEmployee.setId(100L);
//         return inputEmployee;
////        return "Hello from post service";
//    }

    @PostMapping
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity inputEmployee){
        return employeeService.save(inputEmployee);
    }

    //Understand how the dependency injection is happening in above post method

    @PutMapping
    public String updateEmployee(){
        return "Hello from Put service";
    }

    @DeleteMapping
    public String deleteEmployee(){
        return "Hello from delete service";
    }

}
