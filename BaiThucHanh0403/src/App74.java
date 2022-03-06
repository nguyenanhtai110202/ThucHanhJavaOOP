import java.util.Scanner;
public class App74 {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhap vao so phan tu trong mang: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] d = new double[n];
        double total = 0;
        for(int i=0; i<d.length; i++){
            System.out.print("Nhap vao gia tri cho phan tu thu "+(i+1)+": ");
            d[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<d.length; i++){
            total = total + d[i];
        }
        System.out.format("Ket qua la: %.1f", total);
      
    }
}
