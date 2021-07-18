package kodlama.io.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.io.dataAccess.abstracts.CandidateDao;
import kodlama.io.business.abstracts.CandidateService;
import kodlama.io.core.utilities.results.DataResult;
import kodlama.io.core.utilities.results.Result;
import kodlama.io.core.utilities.results.SuccessDataResult;
import kodlama.io.core.utilities.results.SuccessResult;
import kodlama.io.entities.concretes.Candidate;

public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;

    @Autowired
    public CandidateManager(CandidateDao candidateDao){
        super();
        this.candidateDao=candidateDao;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "adaylar listelendi");
    }

    @Override
    public Result add(Candidate candidate) {
        this.candidateDao.save(candidate);
        return new SuccessResult("başarıyla kaydedildi");
    }
    
}
