package Main;
import Shaper.Employee;
import Shaper.OfflineStudent;
import Shaper.OnlineStudent;
import Shaper.Person;
import Shaper.Student;

public class thuchanh {
    public static void main(String[] args){
        Person person = new Person();
        person.nhapTen();
        person.nhapTuoi();
        person.nhapMsv();
        person.nhapDiachi();

        Student student = new Student();
        student.nhapDiemtoan();
        student.nhapDiemvan();
        student.nhapDiemanh();

        OfflineStudent offlineStudent = new OfflineStudent();
        offlineStudent.Noihoc();
        
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.Noihoc();

        Employee employee = new Employee();
        employee.nhapMail();
        employee.nhapSdt();

    }

    
}
