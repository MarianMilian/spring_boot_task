package com.june_19.spring_boot_task.controller;


import com.june_19.spring_boot_task.dao.CustomerRepository;
import com.june_19.spring_boot_task.entity.Application;
import com.june_19.spring_boot_task.entity.Customer;
import com.june_19.spring_boot_task.utill.RestPreconditions;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/")
public class CustomerController {
    //    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


//    @GetMapping( value = "/customers/{id}")
//    public ResponseEntity<Customer> findById (@PathVariable("id")int id){
////        return ResponseEntity.ok().body(customerRepository.findById(id).orElseThrow(() -> ));
//    }

    @PostMapping("/saveCustomer")
    public Customer saveCustomer(@ RequestBody Customer  customer) {
//        customer.setApplications(application);
        Customer customer1 =customerRepository.save(customer);
        return  customer1;
    }
}
