package Shaper;
import java.util.Scanner;
public class Student extends Person {
    public float toan;
    public float van;
    public float anh;

    public Student(){
        
    }
    public Student(float toan, float van, float anh){
        this.toan = toan;
        this.van = van;
        this.anh = anh;
    }
    public void nhapDiemtoan(){
        System.out.println("Diem Toan =   ");
        Scanner scan = new Scanner(System.in);
        toan = scan.nextFloat();
    }
    public void nhapDiemvan(){
        System.out.println("Diem Van =   ");
        Scanner scan = new Scanner(System.in);
        van = scan.nextFloat();
    } 
    public void nhapDiemanh(){
        System.out.println("Diem Anh =   ");
        Scanner scan = new Scanner(System.in);
        anh = scan.nextFloat();
    }
    
}
