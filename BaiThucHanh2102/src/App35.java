import java.util.Scanner;
public class App35 {
    public static void main(String[] args){
        int number1, number2, min = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap vao so thu nhat: ");
        number1 = input.nextInt();
        System.out.print("Nhap vao so thu 2: ");
        number2 = input.nextInt();
        
        min = (number1 < number2) ? number1 : number2;
        System.out.println("So nho nhat trong 2 so nhap vao la: " + min);
    input.close();
    }
}
