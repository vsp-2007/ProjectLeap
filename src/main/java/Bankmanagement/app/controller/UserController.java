package Bankmanagement.app.controller;

import Bankmanagement.app.model.User;
import Bankmanagement.app.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return user.getName() + " added successfully!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "User deleted successfully!";
    }

    @GetMapping
    public List<User> getUsersRoot() {
        return userService.getAllUsers();
    }

    @GetMapping("/all")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public String getEmail(@PathVariable int id) {
        return userService.findEmail(id);
    }

    @PostMapping("/deposit")
    public String deposit(@RequestParam String accountNumber,
                          @RequestParam double amount) {
        return userService.deposit(accountNumber, amount);
    }

    @PostMapping("/withdraw")
    public String withdraw(@RequestParam String accountNumber,
                           @RequestParam double amount) {
        return userService.withdraw(accountNumber, amount);
    }

    @GetMapping("/balance")
    public String checkBalance(@RequestParam String accountNumber) {
        return userService.checkBalance(accountNumber);
    }
}
