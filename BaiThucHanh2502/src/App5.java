import java.util.Scanner;
public class App5 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
        int n;
        System.out.println("Nhap so n de kiem tra: ");
        n= scan.nextInt();

        int tong=0;
        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                tong = tong+i;
            }
        }
        if (tong==n)
        {
            System.out.println(n+ " la so hoan thien! ");

        }else
         {
            System.out.println(n+ " khong la so hoan thien! ");
         } 
        
    

    }
    
}
