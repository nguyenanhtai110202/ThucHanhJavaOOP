package shapes;
import java.util.Scanner;

public class hinhtru extends hinhtron {
    public float chieucao;

    // Constructor
    public hinhtru(){
        ten = "Hinh Tru";
    }
    public void nhapChieucao(){
        nhapBankinh();

        System.out.println("Chieu cao = ");
        Scanner scan = new Scanner(System.in);
        chieucao = scan.nextFloat();
    }
    public void tinhThetich(){
        tinhDienTich();
        thetich = dientich * chieucao;
    }
}
