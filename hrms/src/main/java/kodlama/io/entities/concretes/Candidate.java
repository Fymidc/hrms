package kodlama.io.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class Candidate extends User{

    @Id
    @GeneratedValue
    @Column(name="product_id")
    private String firstName;

    @Column(name="product_id")
    private String lastName;

    @Column(name="product_id")
    private LocalDate birthDate;

    @Column(name="product_id")
    private String tcNo;


    public Candidate(){}

    
    public Candidate(String firstName, String lastName, LocalDate birthDate, String tcNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.tcNo = tcNo;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public String getTcNo() {
        return tcNo;
    }
    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }


}
