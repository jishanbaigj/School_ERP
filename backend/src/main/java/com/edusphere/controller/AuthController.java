package com.edusphere.controller;

import com.edusphere.config.JwtService;
import com.edusphere.model.User;
import com.edusphere.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> request) {
        String username = request.get("username");
        String password = request.get("password");

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

        User user = userRepository.findByUsername(username).orElseThrow();
        String token = jwtService.generateToken(user.getUsername(), user.getRole());
        return ResponseEntity.ok(Map.of(
            "message", "Login successful",
            "token", token,
            "role", user.getRole(),
            "username", user.getUsername(),
            "name", user.getFullName()
        ));
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Map<String, String> request) {
        if (userRepository.existsByUsername(request.get("username"))) {
            return ResponseEntity.badRequest().body(Map.of("message", "Username already exists"));
        }

        User user = User.builder()
            .username(request.get("username"))
            .password(passwordEncoder.encode(request.get("password")))
            .role(request.getOrDefault("role", "student"))
            .fullName(request.get("fullName"))
            .email(request.get("email"))
            .build();

        userRepository.save(user);
        return ResponseEntity.ok(Map.of("message", "User registered successfully"));
    }
}
