package com.anyi;

import com.anyi.dao.UserRepository;
import com.anyi.dto.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.anyi.dao")
@EntityScan("com.anyi.dto")
public class MedicalApplication {

    private static final Logger log = LoggerFactory.getLogger(MedicalApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(MedicalApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository repository) {
        return (args -> {
            repository.save(new UserInfo("shenxb", "123"));
            repository.save(new UserInfo("maxingxing", "456"));

            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (UserInfo customer : repository.findAll()) {
                log.info(customer.toString());
            }

            Optional<UserInfo> customer = repository.findById(1L);
            log.info("Customer found with findById(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");
        });
    }

}
