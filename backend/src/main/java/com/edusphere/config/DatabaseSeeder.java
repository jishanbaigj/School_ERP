package com.edusphere.config;

import com.edusphere.model.User;
import com.edusphere.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DatabaseSeeder implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        if (userRepository.count() == 0) {
            userRepository.save(User.builder()
                .username("admin")
                .password(passwordEncoder.encode("password"))
                .role("ADMIN")
                .fullName("Principal Admin")
                .email("admin@edusphere.com")
                .build());
            userRepository.save(User.builder()
                .username("teacher")
                .password(passwordEncoder.encode("password"))
                .role("TEACHER")
                .fullName("John Teacher")
                .email("teacher@edusphere.com")
                .build());
            userRepository.save(User.builder()
                .username("student")
                .password(passwordEncoder.encode("password"))
                .role("STUDENT")
                .fullName("Alice Student")
                .email("student@edusphere.com")
                .build());
        }
    }
}
