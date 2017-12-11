package service;

import data.entity.User;

import java.util.List;

public interface UserService {
    public User createUser(User user);

    public List<User> getAllUsers();
}
