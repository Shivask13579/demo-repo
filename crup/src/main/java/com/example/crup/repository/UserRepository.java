package com.example.crup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crup.models.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}
