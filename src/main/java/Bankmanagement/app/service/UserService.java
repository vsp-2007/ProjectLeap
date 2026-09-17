package Bankmanagement.app.service;

import Bankmanagement.app.model.User;
import Bankmanagement.app.repository.BankRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private BankRepo bankRepo;

    public User addUser(User user) {
        return bankRepo.save(user);
    }

    public void deleteUser(int id) {
        bankRepo.deleteById(id);
    }

    public List<User> getAllUsers() {
        return bankRepo.findAll();
    }

    public String findEmail(int id) {
        return bankRepo.findEmailById(id);
    }

    public String deposit(String accountNumber, double amount) {
        User user = bankRepo.findByAccountNumber(accountNumber);
        if (user == null) return "Account not found!";
        user.setBalance(user.getBalance() + amount);
        bankRepo.save(user);
        return "Deposited " + amount + " | New Balance: " + user.getBalance();
    }

    public String withdraw(String accountNumber, double amount) {
        User user = bankRepo.findByAccountNumber(accountNumber);

        if (user == null) return "Account not found!";
        if (user.getBalance() < amount) return "Insufficient balance!";
        user.setBalance(user.getBalance() - amount);
        bankRepo.save(user);
        return "Withdrawn " + amount + " | New Balance: " + user.getBalance();
    }

    public String checkBalance(String accountNumber) {
        User user = bankRepo.findByAccountNumber(accountNumber);
        
        if (user == null) return "Account not found!";
        return "Balance for " + user.getName() + ": " + user.getBalance();
    }
}
