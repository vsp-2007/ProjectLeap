package Bankmanagement.app.repository;

import Bankmanagement.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends JpaRepository<User, Integer> {

    @Query("SELECT u.email FROM User u WHERE u.id = ?1")
    String findEmailById(int id);

    User findByAccountNumber(String accountNumber);
}
