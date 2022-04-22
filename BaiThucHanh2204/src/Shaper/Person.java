package Shaper;
import java.util.Scanner;
public class Person {
    public String ten;
    public int tuoi;
    public int msv;
    public String diachi;

    public Person(){

    }
    public Person(String ten, int tuoi, int msv, String diachi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.msv = msv;
    }
    public void nhapTen(){
        System.out.println("Ho va ten: ");
        Scanner scan = new Scanner(System.in);
        ten = scan.nextLine();
    }
    public void nhapTuoi(){
        System.out.println("Tuoi:  ");
        Scanner scan = new Scanner(System.in);
        tuoi = scan.nextInt();
    }
    public void nhapDiachi(){
        System.out.println("Dia chi nha: ");
        Scanner scan = new Scanner(System.in);
        diachi = scan.nextLine();
    }
    public void nhapMsv(){
        System.out.println("Ma sinh vien:  ");
        Scanner scan = new Scanner(System.in);
        msv = scan.nextInt();
    }

    
       
}
