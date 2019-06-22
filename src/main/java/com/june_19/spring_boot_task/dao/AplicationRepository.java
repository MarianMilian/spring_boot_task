package com.june_19.spring_boot_task.dao;

import com.june_19.spring_boot_task.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AplicationRepository extends JpaRepository<Application,Integer> {
}
