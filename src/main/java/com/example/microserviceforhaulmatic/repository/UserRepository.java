package com.example.microserviceforhaulmatic.repository;

import com.example.microserviceforhaulmatic.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserModel , String> {
    UserModel findByUserName(String name);
}
