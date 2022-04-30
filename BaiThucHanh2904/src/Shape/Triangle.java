package Shape;

import java.util.Scanner;

public class Triangle extends Point{
    public float a;
    public float b;
    public float c;

    public void nhapDiemA(){
        System.out.println("A =  ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextFloat();
    }
    public void nhapDiemB(){
        System.out.println("B =  ");
        Scanner scan = new Scanner(System.in);
        b = scan.nextFloat();
    }
    public void nhapDiemC(){
        System.out.println("C =  ");
        Scanner scan = new Scanner(System.in);
        c = scan.nextFloat();
    }
    public void HienThi(){
        if ((a + b > c) && (a + c > b) && (b + c > a) &&
                (a > 0) && (b > 0) && (c > 0)) {
                    if ((a == b) && (b == c)) {
                        System.out.println("Tam giac deu!");
                    } else if ((a == b) || (a == c) || (b == c)) {
                        System.out.println("Tam giac can!");
                    } else if ((a * a == b * b + c * c) ||
                            (b * b == a * a + c * c) ||
                            (c * c == a * a + b * b)) {
                        System.out.println("Tam giac vuong!");
                    } else if (((a * a + b * b == c * c) && (a == b)) ||
                            ((a * a + c * c == b * b) && (a == c)) ||
                            ((b * b + c * c == a * a) && (b == c))) {
                        System.out.println("Tam giac vuong can!");
                    } else {
                        System.out.println("Tam giac thuong!");
                    }
                } else {
                    System.out.println("Day khong phai la tam giac!"); 
                }
            
            }
	
        }

    
    
    




    

