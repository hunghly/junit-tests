import java.util.ArrayList;
import java.util.List;

public class Cohort {
    List<Student> cohortList;

    public Cohort() {
        this.cohortList = new ArrayList<>();
    }

    public void addStudent(Student newStudent) {
        this.cohortList.add(newStudent);
    }

    public List<Student> getCurrentList() {
        return this.cohortList;
    }

    public double getAverage() {
        double sum = 0;
        for (Student student : this.cohortList) {
            sum += student.getGradeAverage();
        }
        return sum / this.cohortList.size();
    }

    public Student findStudentById(long id) {
        Student foundStudent = null;
        for (Student student : this.cohortList) {
            if (student.getId() == id) foundStudent = student;
            break;
        }
        return foundStudent;
    }

}
