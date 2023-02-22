package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user, long id);

    User findUser(long id);
    void remove(long id);
    List<User> getListUsers(int count);
}
