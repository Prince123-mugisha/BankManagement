package com.prince.AutheticationProjects.Repository;

import com.prince.AutheticationProjects.Models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserEntity , Long> {
    Optional<UserEntity> findByEmail(String email);
}
