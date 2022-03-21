import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        ht.nhapBankinh();
    }

}
class HinhTron{

    // Dưới đây là các thuộc tỉnh
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    // Dưới đây là các Phương thức
    void nhapBankinh() {
        System.out.println("Hãy nhập vào Bán kính hình tròn: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
    }

    void tinhChuvi() {
        cv = 2 * PI * r;
    }

    void tinhDienTich() {
        dt = PI * r * r;
    }

    void inChuvi() {
        System.out.println("Chu vi Hình tròn: " + cv);
    }

    void inDientich() {
        System.out.println("Diện tích Hình tròn: " + dt);
    }
}