import java.util.Scanner;
public class App9 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a,b , reversed = 0;
    System.out.println("\n\nNhap vao so n : ");
    a = scan.nextInt();
    b = a;

    for(;a != 0; a /= 10) {
      int digit = a % 10;
      reversed = reversed * 10 + digit;
    }
    System.out.printf("So %d sau khi dao nguoc la: %d", b, reversed);   
    
  }
}