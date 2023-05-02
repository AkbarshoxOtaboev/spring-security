package uz.center.erpapi.services;

import uz.center.erpapi.domains.Role;
import uz.center.erpapi.domains.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUserByUserName(String username);

    List<User> getAllUsers();
}
