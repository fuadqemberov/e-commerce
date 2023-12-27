package com.iktex.ecommerce.service.user;

import com.iktex.ecommerce.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    User findByUsername(String username);

    User findByEmail(String email);

    User findById(Long id);

    List<User> findAllUsers();

    void deleteUser(Long id);

    void updateUser(User user);


}
