package web.service;

import java.util.List;
import web.model.User;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

    User getUser(Long id);

    void updateUser(User user);

    void deleteUser(Long id);
}
