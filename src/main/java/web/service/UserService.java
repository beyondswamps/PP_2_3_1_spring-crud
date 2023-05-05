package web.service;

import java.util.List;
import web.model.User;

public interface UserService {
    List<User> getUsers();

    void addUser(User user);

    User getUser(Integer id);

}
