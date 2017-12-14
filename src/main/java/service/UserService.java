package service;

import data.entity.User;

import java.util.List;

public interface UserService {

    public User create(User user);

    public List<User> getAll();

    public User update(User user);

    public void delete(User user);


}
