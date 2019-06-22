package com.june_19.spring_boot_task.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_ID;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "customer_application",
            joinColumns = @JoinColumn(name = "customer_ID"),
            inverseJoinColumns = @JoinColumn(name = "application_ID"))
    private List<Application> applications;

}