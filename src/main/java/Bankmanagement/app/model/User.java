package Bankmanagement.app.model;

public class User {
    private int id;
    private String name;
    private String email;
    private String accNo;
    private double balance;

    public User() {
    }

    public User(int id, String name, String email, String accNo, double balance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.accNo = accNo;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
