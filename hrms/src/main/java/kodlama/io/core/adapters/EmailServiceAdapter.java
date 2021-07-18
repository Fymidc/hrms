package kodlama.io.core.adapters;

import kodlama.io.business.abstracts.EmailControlService;
import kodlama.io.services.emailchecks.EmailCheckService;

public class EmailServiceAdapter implements EmailControlService{

    private EmailCheckService emailCheckService;

    @Override
    public boolean emailControl(String email) {
        
        return emailCheckService.emailControl(email);
    }

    @Override
    public boolean emailCompanyControl(String email, String web) {
        
        return emailCheckService.emailControlCompany(email, web);
    }
    
}
