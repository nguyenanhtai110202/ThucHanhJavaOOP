
public class App2 {
    public class SinhVien {
        private int maSV;
        private String hoTen;
        private String diaChi;
        private boolean gioitinh;
       
        
        public SinhVien() {
     
        }
        
        public SinhVien(int maSV, String hoten, String diaChi, boolean gioitinh) {
            this.maSV = maSV;
            this.hoTen = hoTen;
            this.diaChi = diaChi;
            this.gioitinh = gioitinh;

        }
        
        public int getMaSV() {
            return maSV;
        }
     
        public void setMaSV(int maSV) {
            this.maSV = maSV;
        }
     
        public String getHoten() {
            return hoTen;
        }
     
        public void setHoten(String hoten) {
            this.hoTen = hoten;
        }
     
        public String getDiaChi() {
            return diaChi;
        }
     
        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }
     
        public Boolean getgioitinh() {
            return gioitinh;
        }
     
        public void setgioitinh(boolean gioitinh) {
            this.gioitinh = gioitinh;
        }
        
    }    
    
}
