import java.util.List;

public class StudentCollection {
    private List<Student> students;

    public void deleteBadStudents() {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).avgScore() < 3) {
                students.remove(i);
                i--;
            } else {
                Student tmp = students.get(i);
                tmp.setCourse(tmp.getCourse() + 1);
                students.set(i, tmp);
            }
        }
    }

    public Student getStudent(int index) {
        return students.get(index);
    }
}
