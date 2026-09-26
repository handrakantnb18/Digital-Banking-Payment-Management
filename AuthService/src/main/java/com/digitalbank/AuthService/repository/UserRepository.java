package com.digitalbank.AuthService.repository;

import com.digitalbank.AuthService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);


}

//save(user);
//findById(id);
//findAll();
//deleteById(id);
//existsById(id);

