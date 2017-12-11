package service;

import data.dao.interfaces.UserDao;
import data.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public User createUser(User user) {
        userDao.create(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return Collections.emptyList();
    }
}
