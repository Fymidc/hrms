package kodlama.io.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.io.business.abstracts.UserService;
import kodlama.io.core.utilities.results.DataResult;
import kodlama.io.core.utilities.results.Result;
import kodlama.io.core.utilities.results.SuccessDataResult;
import kodlama.io.core.utilities.results.SuccessResult;
import kodlama.io.dataAccess.abstracts.UserDao;
import kodlama.io.entities.concretes.User;

public class UserManager implements UserService{

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao){
        super();
        this.userDao=userDao;
    }

    @Override
    public DataResult<List<User>> getAll() {
        
        return new SuccessDataResult<List<User>>(this.userDao.findAll(), "kullanıcılar listelendi");
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("kullanıcı eklendi");
    }
    
}
