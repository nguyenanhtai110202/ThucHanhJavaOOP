package Shape;

import java.util.Scanner;

public class Quadrilateral extends Point {
    public float a;
    public float b;
    public float c;
    public float d;

    public void NhapDiemA(){
        System.out.println("A =  ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextFloat();
    }
    public void NhapDiemB(){
        System.out.println("B =  ");
        Scanner scan = new Scanner(System.in);
        b = scan.nextFloat();
    }
    public void NhapDiemC(){
        System.out.println("C =  ");
        Scanner scan = new Scanner(System.in);
        c = scan.nextFloat();
    }
    public void NhapDiemD(){
        System.out.println("D =  ");
        Scanner scan = new Scanner(System.in);
        d = scan.nextFloat();
    }
    public void loaiTugiac(){
        
    }
    
}
