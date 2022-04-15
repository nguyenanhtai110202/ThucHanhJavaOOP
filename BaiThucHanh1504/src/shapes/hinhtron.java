package shapes;

import java.util.Scanner;

public class hinhtron extends hinhhoc {
    public float banKinh;
    // Constructor
    public hinhtron(){
        ten = " Hinh Tron ";
    }
    
    public void nhapBankinh() {
        System.out.println("Ban Kinh = ");
        Scanner scan = new Scanner(System.in);
        banKinh = scan.nextFloat();
    }
    public void tinhChuvi() {
        chuvi = 2* PI * banKinh;
    }
    public void tinhDienTich(){
        dientich = PI * banKinh * banKinh;
    }
}
