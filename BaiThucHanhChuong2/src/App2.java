import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so can kiem tra n:");
        n = scanner.nextInt();
        if(n%2==0)
        {
            System.out.println("Day la so chan!");
        }
        else
        {
            System.out.println("Day la so le!");
        }
    }
}
