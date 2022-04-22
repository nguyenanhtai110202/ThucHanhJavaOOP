package Shaper;
import java.util.Scanner;
public class fulltimeemployee extends Employee {
    public String thoigianlam;

    public void nhapThoiGianLam() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap thoi gian lam: ");
            thoigianlam = sc.nextLine();
        }

    }

    public void inThoiGianLam() {
        System.out.println("Thoi gian lam: " + thoigianlam);
    }
}

    

