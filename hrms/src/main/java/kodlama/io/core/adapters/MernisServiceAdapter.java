package kodlama.io.core.adapters;

import kodlama.io.business.abstracts.CandidateCheckService;
import kodlama.io.entities.concretes.Candidate;
import kodlama.io.services.KPSMernis.KPSMernisCheckService;

public class MernisServiceAdapter implements CandidateCheckService{

    KPSMernisCheckService mernis = new KPSMernisCheckService();

    @Override
    public boolean checkifReal(Candidate candidate) {
        return mernis.verificateMernis(candidate.getTcNo());
    }
    
}
