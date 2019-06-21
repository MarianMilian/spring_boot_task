package com.june_19.spring_boot_task.dao;

import com.june_19.spring_boot_task.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
