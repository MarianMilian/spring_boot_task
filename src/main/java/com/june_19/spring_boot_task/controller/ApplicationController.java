package com.june_19.spring_boot_task.controller;


import com.june_19.spring_boot_task.dao.AplicationRepository;
import com.june_19.spring_boot_task.dao.CustomerRepository;
import com.june_19.spring_boot_task.entity.Application;
import com.june_19.spring_boot_task.entity.Customer;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ApplicationController {
    //    @Autowired
    private CustomerRepository customerRepository;
    private AplicationRepository aplicationRepository;

    @PutMapping ("/customer/application")
    public ResponseEntity<Application>creatApplication(@RequestBody Application application){
        application.getCustomer().getId()
     return null;
    }


}
