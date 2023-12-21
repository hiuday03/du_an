package com.da.du_an.democode.service.impl;

import com.da.du_an.democode.enity.User;
import com.da.du_an.democode.repository.UserRepository;
import com.da.du_an.democode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> GetUser() {
        return userRepository.findAll();
    }
}
