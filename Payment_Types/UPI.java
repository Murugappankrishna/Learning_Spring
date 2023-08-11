package Learning_Spring.Payment_Types;

public class UPI implements ipay{
public boolean amount(double amount){
    System.out.println("Paying using UPI:"+amount);
    return true;
}
}