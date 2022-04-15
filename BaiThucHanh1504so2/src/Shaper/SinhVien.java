package Shaper;

public class SinhVien {
    private String ten;
    private String tuoi;

    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        if (ten == null  || ten.isEmpty()){
            //Nếu biến chưa ra khởi tạo (mang giá trị null) hoặc biến ten có nội
            //thì hãy lưu với tên "không biết"
            this.ten = "Khong biet";

        }else {
            this.ten = ten;
        }
    }
    public String getTuoi(){
        if(Integer.valueOf(tuoi) != -1){
            //Tuổi hợp lệ
            return tuoi;
        }else {
            return"Tuoi khong hop le";
        }
    }
    public void setTuoi(int tuoi){
        // Kiểm tra tuổi có hợp hay không nếu hợp lý thì lưu vào nêu không sẽ
        if (tuoi > 18){
            this.tuoi = String.valueOf(tuoi);
        }else {
            this.tuoi = String.valueOf(-1);
        }

    }
    
}
