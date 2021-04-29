package com.frankmoley.lil.sbet.fizzbuzz.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FizzBuzzApplication {

    @Bean
    public CommandLineRunner run() {
        return args -> {
            for(int i=1;i<=100;i++) {
                if(i%3 == 0 && i%5 == 0) {
                    System.out.println("FIZZBUZZ");
                }
                else if(i%3 == 0) {
                    System.out.println("FIZZ");
                }
                else if(i%5 == 0) {
                    System.out.println("BUZZ");
                }
                else {
                    System.out.println(i+"");
                }
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(FizzBuzzApplication.class, args);
    }

}
