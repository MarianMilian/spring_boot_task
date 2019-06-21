package com.june_19.spring_boot_task.controller;


import com.june_19.spring_boot_task.dao.CustomerRepository;
import com.june_19.spring_boot_task.entity.Customer;
import com.june_19.spring_boot_task.utill.RestPreconditions;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class MainController {
    //    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    @GetMapping( value = "/{id}")
    public Optional<Customer> findById (@PathVariable("id")int id){
        return RestPreconditions.checkFound(customerRepository.findById(id));
    }

//    @PostMapping("/saveCustomer")
//    public String() {
//        return "";
//    }
}
