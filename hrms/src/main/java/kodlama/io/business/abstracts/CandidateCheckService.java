package kodlama.io.business.abstracts;

import kodlama.io.entities.concretes.Candidate;

public interface CandidateCheckService {
    boolean checkifReal(Candidate candidate);
}
