package data.dao;

import data.entity.User;

import java.util.Optional;

public interface UserDao {

    void create(User user);
    void update(User user);
    Optional<User> getByEmail(String email);

}
