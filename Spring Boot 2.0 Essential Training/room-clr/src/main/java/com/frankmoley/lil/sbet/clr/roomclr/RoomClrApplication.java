package com.frankmoley.lil.sbet.clr.roomclr;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

//this application will hit url given below to romm-web-app(while room-web-app is running) and
//will fetch the room data means its accessing data from remote server which will be displayed in console

@SpringBootApplication
public class RoomClrApplication {
    private static final Logger LOG = LoggerFactory.getLogger(RoomClrApplication.class);

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    //this is one way that we use Command Line Runner
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {

        return args -> {
            LOG.info("Starting clr application");

            ResponseEntity<List<Room>> rooms = restTemplate.exchange("http://localhost:8080/api/rooms",
                    HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {
                    });

            rooms.getBody().forEach(room -> {
                LOG.info(room.toString());
            });

            LOG.info("Finishing clr application");
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(RoomClrApplication.class, args);
    }

}