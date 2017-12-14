package service.impl;

import data.dao.UserDao;
import data.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;

import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor

@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User create(User user) {
        userDao.create(user);
        return user;
    }

    @Override
    public List<User> getAll() {
        return Collections.emptyList();
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(User user) {

    }

}
