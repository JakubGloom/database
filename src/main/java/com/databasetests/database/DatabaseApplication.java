package com.databasetests.database;

import com.databasetests.database.springdata.EmployeeSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EmployeeSpringDataRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(DatabaseApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        //logger.info("All users -> {}", repository.findAll());
    }
}
