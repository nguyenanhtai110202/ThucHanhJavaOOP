import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args) throws Exception {
        int number;
        HashSet<Integer> hashsetInt = new HashSet<>();
        Scanner scan = new Scanner(System.in);

        hashsetInt.add(0);
        hashsetInt.add(3);
        hashsetInt.add(1);
        hashsetInt.add(4);
        hashsetInt.add(2);
        hashsetInt.add(8);
        
        System.out.println("Cac  phan tu trong hashetInt : ");
        System.out.println(hashsetInt);
        System.out.println("Nhap phan tu can them");
        number = scan.nextInt();
        
        if(!hashsetInt.contains(number))
        {
            hashsetInt.add(number);
            System.out.println("Thanh cong");
            System.out.println("Cac phan tu trong hashetInt sau khi them : ");
            System.out.println(number);
        }
        else{
            System.out.println("phan tu " + number + " da ton tai");
        }
        System.out.println(hashsetInt.contains(10));
        System.out.println(hashsetInt);
    }
}
