import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
     int a, b;
     try (Scanner scanner = new Scanner(System.in)) {
        do{
             System.out.print(" Moi nhap so nguyen duong a: ");
             a= scanner.nextInt();
         }while(!(a > 0));
         do{
            System.out.print(" Moi nhap so nguyen duong b: ");
             b= scanner.nextInt();
        }while(!(b > 0));
    }
     for (int u=Math.min(a,b);u>=1; u--){
        if(a%u==0 && b%u==0){
            System.out.format("Uoc chung lon nhat cua %d va %d la: %d",a,b,u);
            break;
        }
    }
    }
}
