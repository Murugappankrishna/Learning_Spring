package Learning_Spring.DRIVER_CLASS;
import Learning_Spring.Payment_Types.*;

public class PAYMENTPROCESSING {
    ipay a=null;
     PAYMENTPROCESSING(ipay a){
            this.a=a;
        }
        
    boolean paymentgateway(String way,Double amount){
        ipay i=a;
        i.amount(amount);
        return true;
    }

    
    
}
