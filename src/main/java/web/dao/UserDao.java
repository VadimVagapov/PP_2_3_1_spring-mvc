package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void update(User user, long id);

    User findUser(long id);
    void remove(long id);
    List<User> getListUsers(String count);
}
