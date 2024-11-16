import java.util.List;

public class Main {
    public void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.printf(student.getName());
            }
        }
    }

    public static void main(String[] args) {

    }
}