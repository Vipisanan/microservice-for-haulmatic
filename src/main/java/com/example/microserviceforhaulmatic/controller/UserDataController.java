package com.example.microserviceforhaulmatic.controller;

import com.example.microserviceforhaulmatic.model.UserModel;
import com.example.microserviceforhaulmatic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("data")
public class UserDataController {

    @Autowired
    UserRepository userRepository;
    @GetMapping("add")
    public UserModel add(){
        UserModel userModel = new UserModel();
        userModel.setUserName("admin");
        userModel.setPassword("1234");
        userModel.setRole("ROLE_ADMIN");
        userRepository.save(userModel);
        return userModel;

    }

    @GetMapping("get-all")
    public List<UserModel> getAll(){
        return userRepository.findAll();
    }
}
