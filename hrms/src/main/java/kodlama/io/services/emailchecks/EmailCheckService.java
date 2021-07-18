package kodlama.io.services.emailchecks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheckService {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public boolean emailControl(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }      

    public boolean emailControlCompany(String email,String web){
        if(emailControl(email)==true && email == web ){
            return true ;
        }
        return false;
    }


    
}
