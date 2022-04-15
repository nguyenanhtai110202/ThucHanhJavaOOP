package shapes;
import java.util.Scanner;

public class hinhvuong extends hinhchunhat {
    //Constructor
    public hinhvuong(){
        ten = " Hinh Vuong ";

    }
    public void nhapCanh(){
        System.out.println("Canh = ");
        Scanner scan = new Scanner(System.in);
        dai = rong = scan.nextFloat();
    }
    
}
