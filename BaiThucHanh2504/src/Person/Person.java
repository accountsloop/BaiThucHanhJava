package Person;

public abstract class Person {
    String name;
    int age;

    public void inTen(String name){
        System.out.println("Ten: " + name);
    }

    public void inTuoi(int age){
        System.out.println("Tuoi: " + age);
    }
}
