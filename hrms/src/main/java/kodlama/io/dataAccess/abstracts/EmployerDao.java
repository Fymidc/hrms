package kodlama.io.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{
    
}
