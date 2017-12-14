package data.dao.impl;

import data.dao.UserDao;
import data.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends AbstractDao<User> implements UserDao {

    public UserDaoImpl() {
        setClassDao(User.class);
    }
}
