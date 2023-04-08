package com.project.notesservice.controller;

import com.project.notesservice.entity.UserEntity;
import com.project.notesservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @PostMapping("/create")
    public ResponseEntity<?> createAdmin() {
        return ResponseEntity.ok(
                userRepository.save(
                        new UserEntity(null, "admin", "$2a$10$AjHGc4x3Nez/p4ZpvFDWeO6FGxee/cVqj5KHHnHfuLnIOzC5ag4fm")));
    }
}
