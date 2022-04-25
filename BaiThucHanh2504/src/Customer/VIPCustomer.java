package Customer;

public class VIPCustomer extends Customer{
    boolean VIP;

    public void khachHangVIP(boolean VIP){
        if(VIP == true){
            System.out.println("Day la khach hang VIP");
        }
    }
}
