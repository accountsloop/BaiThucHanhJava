import java.util.Scanner;

public class hinhchunhat {
    float chieudai, chieurong;
    void setDoDai(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu dai chieu rong: ");
        chieudai = input.nextFloat();
        chieurong = input.nextFloat();
        input.close();
    }

    float getChieuDai(){
        return chieudai;
    }
    float getChieuRong(){
        return chieurong;
    }
    float getChuVi(){
        return ((chieudai + chieurong) * 2);
    }
    float getDienTich(){
        return (chieudai * chieurong);
    }
}
