package com.example.microserviceforhaulmatic.service;

import com.example.microserviceforhaulmatic.config.MyUserDetails;
import com.example.microserviceforhaulmatic.model.UserModel;
import com.example.microserviceforhaulmatic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserModel user = userRepository.findByUserName(s);
        if (user == null)
            throw new UsernameNotFoundException("User 404");
        return new MyUserDetails(user);
    }
}
