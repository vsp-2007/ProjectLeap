package Bankmanagement.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

public class User {

    @Id
    private int id;
    private String name;
    private String email;
    @Column(unique = true)
    private String accountNumber;
    private double balance;
    private String accountType;

}
