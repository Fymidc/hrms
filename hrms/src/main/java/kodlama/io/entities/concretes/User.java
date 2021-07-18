package kodlama.io.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class User{
    @Id
    @GeneratedValue
    @Column(name="product_id")
    private int userId;

    @Column(name="product_id")
    private String email;

    @Column(name="product_id")
    private String password;


    public User(){}


    public User(int userId, String email, String password) {
        this.userId = userId;
        this.email = email;
        this.password = password;
    }


    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


}