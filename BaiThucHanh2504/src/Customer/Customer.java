package Customer;

import Person.Person;

public class Customer extends Person{
    boolean gioiTinh;
    
    public void inGioiTinh(boolean gioiTinh){
        if(gioiTinh == true){
            System.out.println("Nam");
        }
        else{
            System.out.println("Nu");
        }
    }
}
