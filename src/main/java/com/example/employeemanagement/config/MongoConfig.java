package com.example.employeemanagement.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoConfig {

    // MongoDB connection URI to connect to the existing database
    private static final String MONGO_URI = "mongodb://localhost:27017/employeemanagement"; // Update this URI as needed

    @Bean
    public MongoClient mongoClient() {
        // Creating MongoClient object to interact with MongoDB
        return MongoClients.create(MONGO_URI);
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        // Creating MongoTemplate for interacting with the MongoDB
        return new MongoTemplate(new SimpleMongoClientDatabaseFactory(mongoClient(), "employeemanagement"));
    }
}
