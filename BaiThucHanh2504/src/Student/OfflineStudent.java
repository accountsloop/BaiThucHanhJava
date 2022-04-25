package Student;

public class OfflineStudent extends Student{
    boolean off;

    public void sinhVienOffline(boolean off){
        if(off == true){
            System.out.println("Sinh Vien Hoc Offline");
        }
    }
}
