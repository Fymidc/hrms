package kodlama.io.business.abstracts;

import java.util.List;

import kodlama.io.core.utilities.results.DataResult;
import kodlama.io.core.utilities.results.Result;
import kodlama.io.entities.concretes.User;

public interface UserService {
    DataResult<List<User>> getAll();
    Result add(User user);
}
