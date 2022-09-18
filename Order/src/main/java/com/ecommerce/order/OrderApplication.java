package com.ecommerce.order;


import com.ecommerce.order.model.Order;
import com.ecommerce.order.repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableEurekaClient
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(OrderRepository orderRepository){
        return args -> {
            Order order = new Order();
            order.setAddress("ff");
            order.setPrice_order(120);
            order.setDate(LocalDateTime.now());
            order.setNameClient("Amine");
            order.setQuantity(10);
            orderRepository.save(order);


        };
    }
}
