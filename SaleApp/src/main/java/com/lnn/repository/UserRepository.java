/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lnn.repository;

import com.lnn.pojos.User;
import java.util.List;

/**
 *
 * @author Nguyen
 */
public interface UserRepository {
    void addUser(User user);
    List<User> getUsers(String username);
}
