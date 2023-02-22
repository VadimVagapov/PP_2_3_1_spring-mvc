package web.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Qualifier("users")
@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(User newUser, long id) {
        User userOur = findUser(id);
        userOur.setName(newUser.getName());
        userOur.setLastname(newUser.getLastname());
        userOur.setEmail(newUser.getEmail());
    }

    @Override
    public User findUser(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void remove(long id) {
        entityManager.remove(findUser(id));
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getListUsers(int count) {
        List<User> list = (List<User>) entityManager.createQuery("FROM User").getResultList();
        if (count == -1) {
            return list;
        }
        return list.stream().limit(count).toList();

    }
}
