import java.util.Scanner;
 
public class App10 {
 
    public static void main(String[] args) {
        int a, count = 0;
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Nhap vao mot so nguyen duong bat ky: ");
        a = scan.nextInt();
 
        while (a <= 0) {
            System.out.println("So nhap vao phai lon hon 0. Moi nhap lai: ");
            a = scan.nextInt();
        }
         
        while (a > 0) {
            a /= 10;
            count++;    
        }
         
        System.out.println("So cac chu so = " + count);
    }
 
}
