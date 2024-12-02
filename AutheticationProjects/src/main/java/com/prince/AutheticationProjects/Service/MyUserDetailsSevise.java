package com.prince.AutheticationProjects.Service;

import com.prince.AutheticationProjects.Models.UserEntity;
import com.prince.AutheticationProjects.Repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailsSevise implements UserDetailsService {
    private final UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepo.findByEmail(username).orElseThrow(
                () -> new UsernameNotFoundException("user is not found with username: " + username)

        );
        return User.builder().
                username(user.getEmail())
                .password(user.getPassword())
                .build();
    }
}
