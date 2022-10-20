package web.service;

import web.model.User;
import java.util.List;

public interface UserService{

    void saveUser(User user, long[] listRoles);
    User getUserById(Long id);
    void updateUser(User user, long[] roleId);
    void deleteUser(Long id);
    List<User> getAllUsers();
    User getUserByName(String name);
}
