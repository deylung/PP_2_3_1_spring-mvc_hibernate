package web.service;


import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void deleteUser(User user);

    void editUser(User user);

    User getById(Long id);

    List<User> getAllUsers();
}
