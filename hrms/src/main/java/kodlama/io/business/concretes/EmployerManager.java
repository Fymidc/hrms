package kodlama.io.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.io.business.abstracts.EmployerService;
import kodlama.io.core.utilities.results.DataResult;
import kodlama.io.core.utilities.results.Result;
import kodlama.io.core.utilities.results.SuccessDataResult;
import kodlama.io.core.utilities.results.SuccessResult;
import kodlama.io.dataAccess.abstracts.EmployerDao;
import kodlama.io.entities.concretes.Employer;

public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao){
        super();
        this.employerDao=employerDao;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "iş verenler listelendi");
    }

    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("iş veren başarıyla eklendi");
    }
    
}
