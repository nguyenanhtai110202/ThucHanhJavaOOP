package main;
import shapes.hinhchunhat;
import shapes.hinhtron;
import shapes.hinhtru;
import shapes.hinhvuong;

public class App54 {
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

        hinhvuong Hinhvuong = new hinhvuong();
        Hinhvuong.xuatTen();
        Hinhvuong.nhapCanh();
        Hinhvuong.tinhChuvi();
        Hinhvuong.tinhDienTich();
        Hinhvuong.inChuvi();
        Hinhvuong.inDientich();

        hinhchunhat Hinhchunhat = new hinhchunhat();
        Hinhchunhat.xuatTen();
        Hinhchunhat.nhapChieudai();
        Hinhchunhat.nhapChieurong();
        Hinhchunhat.tinhChuvi();
        Hinhchunhat.tinhDienTich();
        Hinhchunhat.inChuvi();
        Hinhchunhat.inDientich();

    }
    
    
}
