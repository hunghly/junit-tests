import java.util.ArrayList;

public class Student {
    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public ArrayList<Integer> getGrades () {
        return this.grades;
    }

    public void addGrade (int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade : this.grades) {
            sum += (double) grade;
        }
        return sum / this.grades.size();
    }

    public void updateGrade(int index, int grade) {
        this.grades.remove(index);
        this.grades.add(index, grade);
    }

    public void deleteGrade(int index) {
        this.grades.remove(index);
    }

}
