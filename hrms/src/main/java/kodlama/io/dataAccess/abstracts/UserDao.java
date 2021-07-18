package kodlama.io.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer>{
    
}
