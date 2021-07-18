package kodlama.io.services.KPSMernis;

public class KPSMernisCheckService {
    public boolean verificateMernis(String identityNo){
        if(identityNo.length()==11){
            return true;
        }
        else return false;
    }
}
