package Shaper;

public class HinhTron {
    public void xuatThongtin(){
        System.out.println("Day la hinh tron");

    }
    private final float PI =3.14f;
    private float banKinh;
    
    public float getBankinh(){
        return banKinh;
    }
    public void setBankinh(float banKinh){
        this.banKinh = banKinh;
    }
    public float tinhChuvi(){
        return 2 * PI * banKinh;

    }
    public float tinhDientich(){
        return PI * banKinh * banKinh;
    }
    
}
