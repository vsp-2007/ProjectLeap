package Bankmanagement.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Bankmanagement.app.model.User;
import Bankmanagement.app.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/add")
    public User add(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/update/{id}")
    public User update(@PathVariable int id, @RequestBody User dta) {
        return userService.updateUser(id, dta);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return userService.deleteUser(id);
    }

    @PutMapping("/rename/{id}")
    public void rename(@PathVariable int id, String name) {
        userService.renameUser(id, name);
    }
}
