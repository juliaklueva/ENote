package data.dao.impl;

import data.dao.UserDao;
import data.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
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
