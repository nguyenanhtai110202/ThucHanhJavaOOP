package Main;
import java.util.Scanner;

public class HinhChuNhat {
    float cd;
    float cr;
    float cv;
    float dt;

   
    void nhapChieudai()
    {
        System.out.println("Hay nhap chieu dai hinh chu nhat: ");
            Scanner scan = new Scanner (System.in);
            cd= scan.nextFloat();
    
    }
    void nhapChieurong()
    {
        System.out.println("Hay nhap chieu rong hinh chu nhat: ");
            Scanner scan = new Scanner (System.in);
            cr= scan.nextFloat();
    
    }
    void tinhChuvi()
    {
        cv = 2 * (cd + cr);
        
    }
    void tinhDientich()
    {
        dt = cd * cr ;
    }
    void inChuvi()
    {
        System.out.println("Chu vi hinh chu nhat la: " +cv );

    }
    void inDientich()
    {
        System.out.println("Dien tich hinh chu nhat la: " + dt );
    }

        public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapChieudai();
        hcn.nhapChieurong();
        hcn.tinhChuvi();
        hcn.tinhDientich();
        hcn.inChuvi();
        hcn.inDientich();
       
    }



}
