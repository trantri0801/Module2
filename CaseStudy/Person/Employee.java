package CaseStudy.Person;

import CaseStudy.utils.DateException;

import java.util.Date;


public class Employee extends Person {

    private int employeeCode;
    private String level;
    private String location;
    private double wage;

    public Employee() {
    }

    public Employee(int employeeCode, String level, String location, double wage) {
        this.employeeCode = employeeCode;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public Employee(String hoTen, Date ngaysinh, String gioiTinh, String soDienThoai, String email, String soCCCD, int employeeCode, String level, String location, double wage) {
        super(hoTen, ngaysinh, gioiTinh, soDienThoai, email, soCCCD);
        this.employeeCode = employeeCode;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String toInfomation()
    {
        return   "ID:"+employeeCode+", Level:"+level+", Location:"+location+", Wage:"+wage+", Full name:"+fullName+
                ", Birth day:"+ DateException.simpleDateFormat.format(birthDay)+", Gender:"+gender+", Phone number: "+phoneNumber
                +", Email:"+email+", CCCD:"+numberCCCD;
    }
}
