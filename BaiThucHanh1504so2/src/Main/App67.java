package Main;

import Shaper.SinhVien;

/*
import Shaper.HinhTron;
import Shaper.HinhTru;
*/
public class App67 {
    /*
    public static void main(String[] agrs){
        HinhTron hinhtron = new HinhTron();
        hinhtron.setBankinh(10);
        HinhTru hinhtru = new HinhTru();

        hinhtron.xuatThongtin();
        float chuVi = hinhtron.tinhChuvi();
        float dienTich = hinhtron.tinhDientich();
        System.out.println("Chu vi hinh tron: "+ chuVi+"; Va dien tich: " + dienTich);
        hinhtru.xuatThongtin();
    }
*/
    public static void main(String[] agrs){
    SinhVien sinhvien1 = new SinhVien();
    SinhVien sinhvien2 = new SinhVien();

    sinhvien1.setTen("");
    sinhvien1.setTuoi(23);

    sinhvien2.setTen("Peter");
    sinhvien2.setTuoi(17);

    
    System.out.println("Sinh vien 1 co ten: "+ sinhvien1.getTen()+ ",tuoi:"+sinhvien1.getTuoi());
    System.out.println("Sinh vien 2 co ten: "+ sinhvien2.getTen()+ ",tuoi:"+sinhvien2.getTuoi()); 

    }
}
