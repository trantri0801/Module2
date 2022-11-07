package DSA.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student {
            private int id;
            private String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

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

            public Student() {

            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<Student>();
        Student student1 = new Student(1, "Tien");
        Student student2 = new Student(2, "Hai");
        Student student3 = new Student(3, "Trung");
        Student student4 = new Student(4, "Thanh");
        myLinkedList.addFirst(student1);

        for (int i = 0; i < myLinkedList.size(); i++){
            Student student = (Student) myLinkedList.get(i);
            System.out.printf(student.getName());
        }
    }
}
