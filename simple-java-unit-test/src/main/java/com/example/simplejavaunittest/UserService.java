package com.example.simplejavaunittest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDomain createUser(UserDomain user) {
        return userRepository.save(user);
    }

    public Optional<UserDomain> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Iterable<UserDomain> getAllUsers() {
        return userRepository.findAll();
    }

    public void updateUser(UserDomain user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
