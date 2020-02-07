import model.Student;
import model.Teacher;

public class Application {
    public static void main(String[] args) {
        //student
        Student student = new Student("李莉", 20, "女");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        student.study();
        student.rest();
        //teacher
        Student[] students = new Student[] {
                new Student("李莉", 20, "女"),
                new Student("王其", 21, "男")
        };
        Teacher teacher = new Teacher("张龙", students);
        teacher.addStudent(new Student("赵毅", 22, "男"));
        teacher.viewStudent();
    }
}
