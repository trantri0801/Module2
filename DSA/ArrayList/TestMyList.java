package DSA.ArrayList;

public class TestMyList {
    public static class Student{
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Student() {
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1,"Anh");
        Student b = new Student(2,"Boo");
        Student c = new Student(3,"Co");
        Student d = new Student(4,"Dung");
        Student e = new Student(5,"Em");

        MyList<Student> studentMyList = new MyList<Student>();
        MyList<Student> newMyList = new MyList<Student>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
        studentMyList.add(e,3);
        studentMyList.size();
        System.out.println();
//        studentMyList.clear();
//        for (int i = 0; i < studentMyList.size; i++){
//            Student student = (Student) studentMyList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
//        System.out.printf(studentMyList.get(2).getName());
//        System.out.println(studentMyList.indexOf(e));
//        System.out.println(studentMyList.contains(e));
        newMyList = studentMyList.clone();
//        for (int i = 0; i < newMyList.size(); i++){
//            System.out.println(newMyList.get(i).getName());
//        }
        newMyList.remove(1);
        for (int i = 0; i < newMyList.size(); i++) {
            System.out.println(newMyList.get(i).getName());
        }
    }
}
