package Employee;

public class PartTimeEmployee extends Employee {
        boolean partTime;
    
        public void nhanVienPartTime(boolean partTime){
            if(partTime == true){
                System.out.println("Nhan vien part time");
            }
        }
    }