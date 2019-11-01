package com.example.springboot_405;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
  User findByUsername(String username);
}
