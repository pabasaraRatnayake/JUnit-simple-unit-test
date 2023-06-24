package com.example.simplejavaunittest;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDomain, Long> {
}



