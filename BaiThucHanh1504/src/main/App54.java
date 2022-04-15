package main;
import shapes.hinhchunhat;
import shapes.hinhtron;
import shapes.hinhtru;
import shapes.hinhvuong;

public class mainclass {
    public static void main(String[] args){
        hinhtron Hinhtron = new hinhtron();
        Hinhtron.xuatTen();
        Hinhtron.nhapBankinh();
        Hinhtron.tinhChuvi();
        Hinhtron.tinhDienTich();
        Hinhtron.inChuvi();
        Hinhtron.inDientich();
        
        hinhtru Hinhtru = new hinhtru();
        Hinhtru.xuatTen();
        Hinhtru.nhapChieucao();
        Hinhtru.tinhThetich();
        Hinhtru.inThetich();
    }
   

    
    
}
