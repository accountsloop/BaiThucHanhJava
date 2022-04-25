package Student;

import Person.Person;

public class Student extends Person{
    String schoolName;

    public void inTenTruong(String schoolName){
        System.out.println("Ten Truong: " + schoolName);
    }
}
