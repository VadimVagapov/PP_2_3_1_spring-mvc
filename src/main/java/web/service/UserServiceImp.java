package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void update(User user, long id) {
        userDao.update(user, id);
    }

    @Override
    public User findUser(long id) {
        return userDao.findUser(id);
    }

    @Override
    public void remove(long id) {
        userDao.remove(id);
    }

    @Override
    public List<User> getListUsers(int count) {
        return userDao.getListUsers(count);
    }
}
