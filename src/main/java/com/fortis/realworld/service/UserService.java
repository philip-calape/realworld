package com.fortis.realworld.service;

import com.fortis.realworld.dto.UserRegistrationDto;
import com.fortis.realworld.model.UserEntity;
import com.fortis.realworld.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity createUser(UserRegistrationDto userRegistrationDto) {
        return userRepository.save(new UserEntity(userRegistrationDto.getEmail(), userRegistrationDto.getPassword()));
    }
}
