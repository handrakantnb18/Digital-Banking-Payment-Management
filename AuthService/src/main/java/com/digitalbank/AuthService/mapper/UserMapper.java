package com.digitalbank.AuthService.mapper;

import com.digitalbank.AuthService.dto.RegisterRequest;
import com.digitalbank.AuthService.dto.UserResponse;
import com.digitalbank.AuthService.entity.User;

public class UserMapper {

    public User toEntity(RegisterRequest request) {

        User user = new User();

        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setFirstname(request.getFirstName());
        user.setLastname(request.getLastName());
        user.setPhone(request.getPhone());

        return user;

    }

    public UserResponse toResponse(User user) {

        return new UserResponse(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getFirstname(),
                user.getLastname(),
                user.getPhone(),
                user.getRole() != null ? user.getRole().name() : null,
                user.isEnabled()
        );
    }
}
