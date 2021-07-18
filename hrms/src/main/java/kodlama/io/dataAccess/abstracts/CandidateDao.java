package kodlama.io.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer>{
    
}
