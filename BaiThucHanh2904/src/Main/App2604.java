package Main;
import Shape.Point;
import Shape.Quadrilateral;
import Shape.Triangle;


public class App2604 {
    public static void main(String[] args){
        Point point = new Point();
        point.setTenDiem(1);
        point.setTungDo();
        point.setHoanhDo(0);

        point.nhapTenDiem();
        point.nhapTungDo();
        point.nhapHoanhDo();
        point.toado();

        Triangle triangle = new Triangle();
        triangle.nhapDiemA();
        triangle.nhapDiemB();
        triangle.nhapDiemC();
        triangle.HienThi();

        Quadrilateral quadrilateral = new Quadrilateral();
        quadrilateral.NhapDiemA();
        quadrilateral.NhapDiemB();
        quadrilateral.NhapDiemC();
        quadrilateral.NhapDiemD();

    }

}
