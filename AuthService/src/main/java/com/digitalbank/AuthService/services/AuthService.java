package com.digitalbank.AuthService.services;

import com.digitalbank.AuthService.dto.LoginRequest;
import com.digitalbank.AuthService.dto.LoginResponse;
import com.digitalbank.AuthService.dto.RegisterRequest;
import com.digitalbank.AuthService.dto.UserResponse;


public interface AuthService {

    UserResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

}

// POST
// /api/auth/register
// Create new user
//{
//    "username": "rahul123",
//        "email": "rahul@gmail.com",
//        "password": "Rahul@123",
//        "firstName": "Rahul",
//        "lastName": "Patil",
//        "phone": "9876543210"
//}


// POST
//  /api/auth/login
// Authenticate user and generate JWT

//{
//    "email": "rahul@gmail.com",
//        "password": "Rahul@123"
//}


