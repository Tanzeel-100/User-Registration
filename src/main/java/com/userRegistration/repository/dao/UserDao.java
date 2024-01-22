package com.userRegistration.repository.dao;

import com.userRegistration.repository.entities.User;

import java.util.List;

public interface UserDao {
    public int insertUser(User user);
    public User getUser(String email);
    public List<User> getUsers();
    public void updateUser(User user);
    public void deleteUser(String email);
}
