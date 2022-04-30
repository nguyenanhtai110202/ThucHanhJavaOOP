package Shape;
import java.util.Scanner;
public class Point {
    private String tendiem;
    private float tungdo;
    private float hoanhdo;

    public String getTenDiem(){
        return tendiem;
    }
    public void setTenDiem(int i) {
        this.tendiem = tendiem;
    }
    public float getTungDo(){
        return tungdo;
    }
    public void setTungDo(){
        this.tungdo = tungdo;
    }
    public float getHoanhDo(){
        return hoanhdo;
    }
    public void setHoanhDo(float hoanhdo){
        this.hoanhdo = hoanhdo;
    }
    
    public void nhapTenDiem(){
        System.out.println("Ten diem la: ");
        Scanner scan = new Scanner(System.in);
        tendiem = scan.nextLine();
    }
    public void nhapTungDo(){
        System.out.println("Tung Do =  ");
        Scanner scan = new Scanner(System.in);
        tungdo = scan.nextFloat();
    }
    public void nhapHoanhDo(){
        System.out.println("Hoanh Do =  ");
        Scanner scan = new Scanner(System.in);
        hoanhdo = scan.nextFloat();
    }
    
    public void toado(){
        System.out.println("("+ tungdo +"," + hoanhdo +")");
       
    }
   
    

}   
