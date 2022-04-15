package shapes;
import java.util.Scanner;

public class hinhchunhat extends hinhhoc {
    public float dai;
    public float rong;
    
    //Constructor
    public hinhchunhat(){
        ten = " Hinh Chu Nhat";
    }
    public void nhapChieudai(){
        System.out.println("Chieu Dai = ");
        Scanner scan = new Scanner(System.in);
        dai = scan.nextFloat();
    }
    public void nhapChieurong(){
        System.out.println("Chieu Rong = ");
        Scanner scan = new Scanner(System.in);
        rong = scan.nextFloat();
    }
    public void tinhChuvi(){
        chuvi = 2 * ( dai + rong);
    }
    public void tinhDienTich(){
        dientich = dai * rong;
    }
}
