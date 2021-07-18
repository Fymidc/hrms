package kodlama.io.business.abstracts;

import java.util.List;

import kodlama.io.core.utilities.results.DataResult;
import kodlama.io.core.utilities.results.Result;
import kodlama.io.entities.concretes.Employer;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
    Result add(Employer employer);
}
