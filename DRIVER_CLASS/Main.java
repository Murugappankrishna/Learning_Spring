package Learning_Spring.DRIVER_CLASS;

public class Main {
    public static void main(String[] args) {
        PAYMENTPROCESSING p=new PAYMENTPROCESSING();
       boolean result=p.paymentgateway("CREDITCARD" ,100.1);
       if(result==true){
        System.out.println("Payment Successful");
       }
       else {
        System.out.println("Pyment Failed ");
       }
    }
}
