import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhap vao ba so a, b, c");
        Scanner abc = new Scanner(System.in);
        double a = abc.nextDouble();
        double b = abc.nextDouble();
        double c = abc.nextDouble();
        
        if(a==0) {
            System.out.println("Phuong trinh co nghiem la: "+ (-c/b));
        }else {
            double delta = b * b - 4 * a * c;

            if(delta < 0) {
                System.out.println("Phuong trinh vo nghiem:");

            }else if (delta == 0) {
                double x = -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep:" +x);

            }else {
                double x1 = (-b + Math.sqrt(delta))/ (2*a);
                double x2 = (-b - Math.sqrt(delta))/ (2*a);
                
                System.out.println("Phuong trinh co 2 nghiem:");
                System.out.println("Nghiem x1 = "+ x1);
                System.out.println("Nghiem x2 = "+ x2);
            }
        }
        
        


        
       
        
    }
}
