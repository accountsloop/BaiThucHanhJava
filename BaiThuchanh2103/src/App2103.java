public class App2103 {
    public static void main(String[] args) throws Exception{
        //1 Hinh chu nhat
        System.out.println("Bai 1");
        hinhchunhat hcn = new hinhchunhat();
        hcn.setDoDai();
        System.out.println("Chieu dai hinh chu nhat la: " + hcn.getChieuDai());
        System.out.println("Chieu rong hinh chu nhat la: " + hcn.getChieuRong());
        System.out.println("Chu vi hinh chu nhat la: " + hcn.getChuVi());
        System.out.println("Dien tich hinh chu nhat la: " + hcn.getDienTich());
      
        //2 Person
        System.out.println("Bai 2");
        Person ps = new Person();
        ps.setPerson();
        System.out.println("\nIn du lieu da nhap ra man hinh");
        ps.getPerson();

        //3 SinhVien
        System.out.println("Bai 3");
        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        sv.inThongTin();

        //4 PhuongTrinhBacHai
        System.out.println("Bai 4");
        PhuongTrinhBacHai pt = new PhuongTrinhBacHai();
        pt.nhap();
        pt.giaiPhuongTrinh();
        pt.inKetQua();
    }
}
