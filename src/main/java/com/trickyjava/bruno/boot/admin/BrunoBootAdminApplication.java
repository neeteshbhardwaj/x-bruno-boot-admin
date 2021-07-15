package com.trickyjava.bruno.boot.admin;

import de.codecentric.boot.admin.server.config.AdminServerHazelcastAutoConfiguration;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication(exclude = AdminServerHazelcastAutoConfiguration.class)
public class BrunoBootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrunoBootAdminApplication.class, args);
    }

}
