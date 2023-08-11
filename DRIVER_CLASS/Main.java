package Learning_Spring.DRIVER_CLASS;

import Learning_Spring.Payment_Types.CREDID_CARD;
import Learning_Spring.Payment_Types.UPI;

public class Main {
    public static void main(String[] args) {
       PAYMENTPROCESSING p=new PAYMENTPROCESSING(new UPI());// tightly coupled main class is dependent on paymentprocessing class 
       boolean result=p.paymentgateway("CREDITCARD" ,100.1);
       if(result==true){
        System.out.println("Payment Successful");
       }
       else {
        System.out.println("Pyment Failed ");
       }
    }
}
