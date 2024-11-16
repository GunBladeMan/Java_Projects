public class Student {
    private String name;
    private int group;
    private int course;
    private int[] scores;
    private int qtySubjects;

    public Student(String name, int group, int course, int[] scores, int qtySubjects) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.scores = scores;
        this.qtySubjects = qtySubjects;
    }

    public int avgScore() {
        int avg = 0;
        for (int i = 0; i < qtySubjects; i++) {
            avg += scores[i];
        }
        avg /= qtySubjects;
        return avg;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
