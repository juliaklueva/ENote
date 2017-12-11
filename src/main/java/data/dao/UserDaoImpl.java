package data.dao;

import data.dao.interfaces.UserDao;
import data.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Optional;

@Repository
//@Transactional(propagation = Propagation.MANDATORY)
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    //  @Autowired
    // public UserDaoImpl(EntityManagerFactory entityManagerFactory) {
    //   entityManager = entityManagerFactory.createEntityManager();
    //}

    @Override
    public void create(User user) {
        //  entityManager.getTransaction().begin();
        entityManager.persist(user);
        //  entityManager.flush();
        //  entityManager.getTransaction().commit();
    }

    @Override
    // @Transactional
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public Optional<User> getByEmail(String email) {
        TypedQuery<User> query = entityManager
                .createQuery("from User u where u.email = :email", User.class);
        query.setParameter("email", email);

        return Optional.ofNullable(query.getSingleResult());
    }
}
