import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class App30 {
    public static void main(String[] args) throws Exception {
        int n;
        int tong = 0;
        System.out.println("Nhap so nguyen n = ");
        n = new Scanner(System.in).nextInt();
        int m = n;
        System.out.print("tong =");
        while(n > 0){ 
            System.out.print (n %10+" + ");
            tong+= n%10;
            n/=10;
        }
        System.out.println("\b\b");
        System.out.println("Tong cac chu so vua nhap cua " +m+ " ="+tong);

        
    }
}
