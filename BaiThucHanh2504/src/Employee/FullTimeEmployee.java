package Employee;

public class FullTimeEmployee extends Employee{
    boolean fullTime;

    public void nhanVienFullTime(boolean fullTime){
        if(fullTime == true){
            System.out.println("Nhan vien full time");
        }
    }
}
