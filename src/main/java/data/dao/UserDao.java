package data.dao;

import data.entity.User;

import java.util.List;
import java.util.Optional;


public interface UserDao {

    void create(User user);

    void update(User user);

    //  Optional<User> getByEmail(String email);

    Optional<User> getById(long id);

    List<User> getAll();

    void deleteById(long id);
}
