package Shaper;
import java.util.Scanner;
public class Employee extends Person {
    public String mail;
    public int SDT;

    public Employee(){

    }
    public Employee(String mail, int SDT){
        this.mail = mail;
        this.SDT = SDT;
    }
    public void nhapMail(){
        System.out.println("Dia chi Mail: ");
        Scanner scan = new Scanner(System.in);
        mail = scan.nextLine();
    }
    public void nhapSdt(){
        System.out.println("So dien thoai la: ");
        Scanner scan = new Scanner(System.in);
        SDT = scan.nextInt();
    }
    
    
}
