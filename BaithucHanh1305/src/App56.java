import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args) throws Exception {
        String name;
        HashSet<String> hashsetString = new HashSet<>();
        Scanner scan = new Scanner(System.in);

        hashsetString.add("Wilson");
        hashsetString.add("Nike");
        hashsetString.add("Volvo");
        hashsetString.add("Kia");
        hashsetString.add("Lenovo");
        hashsetString.add("Lenovo");

        System.out.println("Cac  phan tu trong hashetString : ");
        System.out.println(hashsetString);
        System.out.println("Nhap phan tu can xoa");
        name = scan.nextLine();

        if(hashsetString.contains(name)){
            hashsetString.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu con lai trong hashSetString:");
            System.out.println(hashsetString);
        }else {
            System.out.println("Xoa khong thanh cong! ");
        }
    }

    
    
}
