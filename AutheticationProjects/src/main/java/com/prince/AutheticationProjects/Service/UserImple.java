package com.prince.AutheticationProjects.Service;

import com.prince.AutheticationProjects.Models.UserEntity;


public interface UserImple {
    public UserEntity addUser(UserEntity user);
    public String verifyUser(UserEntity user);
}
