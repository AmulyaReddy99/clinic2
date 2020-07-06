package com.example.demo.repository;

import com.example.demo.controller.MongoExample;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoExampleRepository extends MongoRepository<MongoExample, String> {

}
