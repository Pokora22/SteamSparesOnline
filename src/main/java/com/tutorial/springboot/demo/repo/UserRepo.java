package com.tutorial.springboot.demo.repo;

import java.util.Optional;

import com.tutorial.springboot.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author Ramesh Fadatare
 *
 */
public interface UserRepo extends JpaRepository<User, Integer>
{
    Optional<User> findByEmail(String email);
}