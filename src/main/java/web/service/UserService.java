package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteById(Long id);
    List<User> listUsers();
    void updateUser(User user);
}
