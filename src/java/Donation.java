import javax.persistence.*;
import org.hibernate.annotations.Table;


public class Donation {
   
    private int id;
    private String name;
    private String email;
    private double amount;

    public Donation() {}

    public Donation(String name, String email, double amount) {
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    // Getters and setters
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
