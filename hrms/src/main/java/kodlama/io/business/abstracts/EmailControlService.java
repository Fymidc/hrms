package kodlama.io.business.abstracts;

public interface EmailControlService {
    public boolean emailControl(String email);
    public boolean emailCompanyControl(String email,String web);
}
