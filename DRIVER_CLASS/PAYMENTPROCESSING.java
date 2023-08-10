package Learning_Spring.DRIVER_CLASS;
import Learning_Spring.Payment_Types.*;




public class PAYMENTPROCESSING {
    boolean paymentgateway(String way,Double amount){
        if("CREDIDCARD".equals(way)){
            CREDID_CARD cc=new CREDID_CARD();
            
            return cc.amount(amount);
        }
        if("UPI".equals(way)){
          UPI up= new UPI();
          return up.amount(amount);
        }
        return false;
    }
    
}
