/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lnn.service;

import com.lnn.pojos.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author Nguyen
 */
public interface UserService extends UserDetailsService {
    void addUser(User user);
    User getUserByUsername(String username);
}
