import java.util.Scanner;
public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
        int n;
        System.out.println("Nhap so n: ");
        n= scan.nextInt();
         
        for(int i=1; i<n; i++)
        {
            int dem = 0;
            for(int j = 1; j<=n; j++)
            {
                if(i%j==0)
                {
                    dem++;
                }
            }
            if(dem==2)
            {
                System.out.print(" "+i);
            }
        }
    }
}
   
  
                                          
    
 

       
     
   