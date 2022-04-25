package Student;

public class OnlineStudent extends Student{
    boolean on;

    public void sinhVienOnline(boolean on){
        if(on == true){
            System.out.println("Sinh Vien Hoc Online");
        }
    }
}