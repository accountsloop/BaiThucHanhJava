import java.util.Scanner;
public class App30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number, sum = 0, last = 0;
        do{
            System.out.print("Nhap so nguyen n: ");
            number = input.nextInt();
            if(number <= 0){
                System.out.println("Nhap lai so nguyen n > 0");
            }
        }while(number <= 0);
        while(number > 0){
            last = number % 10;
            sum += last;
            number /= 10;
        }
        System.out.println("Tong cac chu so cua so do la: " + sum);
    input.close();    
    }
}
