package kodlama.io.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="")
public class Employer extends User {

        @Id
        @GeneratedValue
        @Column(name="product_id")
        private String companyName;

        @Column(name="product_id")
        private String phone;

        @Column(name="product_id")
        private String webAdress;


        public Employer(){}
        
        public Employer(String companyName, String phone, String webAdress) {
            this.companyName = companyName;
            this.phone = phone;
            this.webAdress = webAdress;
        }

        public String getCompanyName() {
            return companyName;
        }
        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }
        public String getPhone() {
            return phone;
        }
        public void setPhone(String phone) {
            this.phone = phone;
        }
        public String getWebAdress() {
            return webAdress;
        }
        public void setWebAdress(String webAdress) {
            this.webAdress = webAdress;
        }


}
