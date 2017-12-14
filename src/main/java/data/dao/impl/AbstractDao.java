package data.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

public abstract class AbstractDao<T> {
    @PersistenceContext
    EntityManager entityManager;
    private Class<T> classDao;

    public final void setClassDao(Class<T> classToSet) {
        this.classDao = classToSet;
    }

    public void create(T entity) {
        entityManager.persist(entity);
    }

    public void update(T entity) {
        entityManager.merge(entity);
    }


    public Optional<T> getById(long id) {
        return Optional.ofNullable(entityManager.find(classDao, id));
    }

    public List<T> getAll() {
        return entityManager.createQuery("from " + classDao.getName()).getResultList();

    }

    public void findById(long id) {
        entityManager.find(classDao, id);
    }

    /*  TypedQuery<User> query = entityManager
              .createQuery("from User as u where u.email = :email", User.class);
          query.setParameter("email", email);
          return Optional.ofNullable(query.getSingleResult());
  */
    public void deleteById(long id) {
        entityManager.createQuery("update " + classDao.getName() + " set deleted='true' where id=?id", classDao).setParameter("id", id);
    }
}
