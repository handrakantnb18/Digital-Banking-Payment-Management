package com.digitalbank.AuthService.security;

import com.digitalbank.AuthService.entity.User;
import com.digitalbank.AuthService.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
 public class CustomUserDetailsService implements UserDetailsService {

// public class CustomUserDetailsService {

    private final UserRepository userRepository;

    public  CustomUserDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDetails loadUserByUsername(String email)
    throws UsernameNotFoundException {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                "User nnot found email : "+email
                        )
                        );

        return org.springframework.security.core.userdetails.User
                .withUsername(user.getEmail())
                .password(user.getPassword())
                .authorities("ROLE_"+user.getRole().name())
                .disabled(!user.isEnabled())
                .build();
    }

}
