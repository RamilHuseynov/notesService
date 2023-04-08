package com.project.notesservice.service;

import com.project.notesservice.entity.UserEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService {
    UserEntity loadUserByUsername(String username) throws UsernameNotFoundException;
}
