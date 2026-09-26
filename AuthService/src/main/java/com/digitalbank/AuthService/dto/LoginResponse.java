package com.digitalbank.AuthService.dto;


public class LoginResponse {

    private String token;
    private String tokenType;
    private Long userId;
    private String username;
    private String email;
    private String role;

    public LoginResponse() {

    }

    public LoginResponse(String email, String token, String tokenType, Long userId, String username, String role) {
        this.email = email;
        this.token = token;
        this.tokenType = tokenType;
        this.userId = userId;
        this.username = username;
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "token='" + token + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

}


//{
//    "token": "eyJhbGciOiJIUzI1NiJ9...",
//        "tokenType": "Bearer",
//        "userId": 101,
//        "username": "rahul123",
//        "email": "rahul@gmail.com",
//        "role": "USER"
//}

