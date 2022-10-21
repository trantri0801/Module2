package AccessModifier.Student;

import AccessModifier.Student.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Tri");
        student.setClasses("A0722I1");
        System.out.println(student.toString());
    }
}
