package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getUsers() {

        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Transactional(readOnly = true)
    @Override
    public User getUserById(int id) {

        return entityManager.find(User.class, id);
    }

    @Transactional
    @Override
    public void updateUser(User user) {

        User userToBeUpdated = entityManager.find(User.class, user.getId());
        userToBeUpdated.setName(user.getName());
        userToBeUpdated.setLastName(user.getLastName());
        userToBeUpdated.setAge(user.getAge());

    }

    @Transactional
    @Override
    public void deleteUser(int id) {

        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }
}
