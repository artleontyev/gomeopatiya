package ru.gomeopatiya.dao;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void updateUser(Long id, User user);

    void removeUser(Long id);

    User getUserById(Long id);

    List<User> getAllUsers();

    User findUserByEmail(String email);
}
