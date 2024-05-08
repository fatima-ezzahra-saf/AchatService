package com.example.customerservice;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repositories.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepo customerRepo){
        return args -> {
            customerRepo.save(new Customer(null,"hassan","hassan@gmail.com"));
            customerRepo.save(new Customer(null,"latifa","latifa@gmail.com"));
            customerRepo.save(new Customer(null,"khalid","khalid@gmail.com"));
            customerRepo.findAll().forEach(System.out::println);
        };
    }
}
