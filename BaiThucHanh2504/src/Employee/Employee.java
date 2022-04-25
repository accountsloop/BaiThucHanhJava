package Employee;

import Person.Person;

public class Employee extends Person{
    String companyName;

    public void inTenCongTy(String companyName){
        System.out.println("Ten Cong Ty: " + companyName);
    }

}