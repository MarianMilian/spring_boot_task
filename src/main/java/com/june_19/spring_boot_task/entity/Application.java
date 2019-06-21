package com.june_19.spring_boot_task.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name ="course_name")
    private String nameOfCourses;
    private LocalDate localDate;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Customer customer;

}
//    Система приймає 6 полів. 2 з яких відносяться до моделі Заявка - Дата заявки,
//        Назва курсу або послуги. 4 поля відносяться до моделі Клієнт - ім'я,
//        прізвище, теефон, пошта. При отриманні всіх 6 полів, створюється два окремих об'єкти.
//        Один - Заявка, Один - Клієнт. В одного клієнта може бути багато заявок.
//        У випадку, якщо клієнт замовляє ще одну послугу, новий об'єкт клієнта не створються.
//        Відбувається перевірка введених даних,
//        у випадку якщо пошта або телефон вже існують в якогось клієнта,
//        тоді створюється нова Заявка з вже існуючим клєнтом