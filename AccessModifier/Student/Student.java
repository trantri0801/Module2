package AccessModifier.Student;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student = " + name + ", classes= " + classes ;
    }
}
