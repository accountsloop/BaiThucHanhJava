import java.util.Scanner;
public class Person {
    String PersonID, PersonName, Address;
    Boolean Gender;
    void setPerson(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap PersonID: ");
        PersonID = input.nextLine();
        System.out.print("Nhap PersonName: ");
        PersonName = input.nextLine();
        System.out.print("Nhap Address: ");
        Address = input.nextLine();
        System.out.print("Nhap Gender: ");
        Gender = input.nextBoolean();
        input.close();
    }

    void getPerson(){
        System.out.println("PersonID: " + PersonID);
        System.out.println("PersonName: " + PersonName);
        System.out.println("Address: " + Address);
        System.out.println("Gender: " + Gender);
    }
}
