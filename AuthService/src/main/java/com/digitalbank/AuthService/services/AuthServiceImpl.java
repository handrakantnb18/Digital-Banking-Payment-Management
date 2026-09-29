package com.digitalbank.AuthService.services;

//import com.digitalbank.AuthService.dto.LoginRequest;
//import com.digitalbank.AuthService.dto.LoginResponse;
//import com.digitalbank.AuthService.dto.RegisterRequest;
//import com.digitalbank.AuthService.dto.UserResponse;
//import com.digitalbank.AuthService.entity.Role;
//import com.digitalbank.AuthService.entity.User;
//import com.digitalbank.AuthService.exception.InvalidCredentialsException;
//import com.digitalbank.AuthService.exception.UserAlreadyExistsException;
//import com.digitalbank.AuthService.mapper.UserMapper;
//import com.digitalbank.AuthService.repository.UserRepository;
//import com.digitalbank.AuthService.security.JwtService;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
public class AuthServiceImpl implements AuthService {

//    private final UserRepository userRepository;
//    private final UserMapper userMapper;
//    private final PasswordEncoder passwordEncoder;
//    private final AuthenticationManager authenticationManager;
//    private final JwtService jwtService;
//
//    public AuthServiceImpl(
//            UserRepository userRepository,
//            UserMapper userMapper,
//            PasswordEncoder passwordEncoder,
//            AuthenticationManager authenticationManager,
//            JwtService jwtService
//    )
//    {
//        this.userRepository = userRepository;
//        this.userMapper = userMapper;
//        this.passwordEncoder = passwordEncoder;
//        this.authenticationManager = authenticationManager;
//        this.jwtService = jwtService;
//    }
//    @Override
//    public UserResponse register(RegisterRequest request)
//    {
//        if (userRepository.existsByEmail(request.getEmail()))
//        {
//            throw new UserAlreadyExistsException(
//                    "User already exists with email: "
//                            + request.getEmail());
//        }
//
//        if (userRepository.existsByUsername(
//                request.getUsername()))
//        {
//            throw new UserAlreadyExistsException(
//                    "Username already exists: "
//                            + request.getUsername());
//        }
//
//        User user =
//                userMapper.toEntity(request);
//
//        user.setPassword(
//                passwordEncoder.encode(
//                        request.getPassword()));
//
//        user.setRole(Role.USER);
//        user.setEnabled(true);
//
//        User savedUser =
//                userRepository.save(user);
//        return userMapper
//                .toResponse(savedUser);
//    }
//
//    @Override
//    public LoginResponse login(LoginRequest request) {
//
//        try {
//            Authentication authentication =
//                    authenticationManager.authenticate(
//                            new UsernamePasswordAuthenticationToken(
//                                    request.getEmail(),
//                                    request.getPassword()));
//
//            User user =
//                    userRepository .findByEmail(
//                            request.getEmail())
//                            .orElseThrow(() ->
//                                    new InvalidCredentialsException(
//                                            "Invalid email or password"));
//
//            String token =
//                    jwtService.generateToken(authentication);
//
//            return new LoginResponse(
//                    user.getEmail(),
//                    token,
//                    "Bearer",
//                    user.getId(),
//                    user.getUsername(),
//                    user.getRole().name()
//            );
//
//        }
//        catch (AuthenticationException exception)
//        {
//            throw new InvalidCredentialsException(
//                    "Invalid email or password");
//        }
//    }

}

//    public User register(User user) {
//
//        if(userRepository.existsByEmail(user.getEmail())){
//            throw new RuntimeException("Email already registered");
//        }
//
//        return userRepository.save(user);
//    }
//
//    public User findByUserEmail(String email) {
//        return userRepository.findByEmail(email)
//                .orElseThrow(() -> new RuntimeException("User not found."));
//    }
// }
