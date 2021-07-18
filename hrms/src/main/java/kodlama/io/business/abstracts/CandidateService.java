package kodlama.io.business.abstracts;

import java.util.List;

import kodlama.io.core.utilities.results.DataResult;
import kodlama.io.core.utilities.results.Result;
import kodlama.io.entities.concretes.Candidate;

public interface CandidateService {
    DataResult<List<Candidate>> getAll();
    Result add(Candidate candidate);
}
