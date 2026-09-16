package Bankmanagement.app.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import Bankmanagement.app.model.User;

@Service
public class UserService {

    List<User> userList = new ArrayList<>();

    public UserService() {
        userList.add(new User(1, "vsp", "vsp@gmail.com", "101", 50000.0));
        userList.add(new User(2, "vsp1", "vsp1@gmail.com", "102", 2300.5));
    }

    public List<User> getUsers() {
        return userList;
    }

    public User getUserById(int id) {
        if (id == 1) {
            return userList.get(0);
        }
        return userList.get(id);
    }

    public User addUser(User user) {
        userList.add(user);
        return user;
    }

    public User updateUser(int id, User dta) {
        for (int i = 0; i <= userList.size(); i++) {
            if (userList.get(i).getId() == id) {
                userList.set(id, dta);
                return dta;
            }
        }
        return null;
    }

    public String deleteUser(int id) {
        userList.remove(id);
        return "user removed";
    }

    public void renameUser(int id, String newName) {
        userList.get(id).setName(newName);
    }
}
