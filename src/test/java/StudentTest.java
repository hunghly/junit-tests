//import org.junit.Test;
import org.junit.*;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() {
        this.student = new Student("hung", 123);
        this.student.addGrade(100);
    }

    @Test
    public void testConstructor() {
        Assert.assertEquals("hung", this.student.getName());
        Assert.assertEquals(123, this.student.getId());
    }

    @Test
    public void testGetID() {
        Assert.assertEquals(123, this.student.getId());
    }

/*    @Test
    public void testIdIsLong() {
        Assert.assertTrue(this.student.getId());
    }*/

    @Test
    public void testGetName() {
        Assert.assertEquals("hung", this.student.getName());
    }

    @Test
    public void testAddGrade() {
        Assert.assertEquals(1, this.student.getGrades().size());
        this.student.addGrade(90);
        Assert.assertEquals(2, this.student.getGrades().size());
    }

    @Test
    public void testGetGradeAverage() {
        this.student.addGrade(90);
        Assert.assertEquals(95, this.student.getGradeAverage(), 0);
    }

    @Test
    public void testUpdateGrade() {
        Assert.assertTrue(this.student.getGrades().size() > 0);
        Assert.assertEquals(100, (int) this.student.getGrades().get(0));
        this.student.updateGrade(0, 90);
        Assert.assertEquals(90, (int) this.student.getGrades().get(0));
    }

    @Test
    public void testDeleteGrade() {
        Assert.assertEquals(1, this.student.getGrades().size());
        this.student.deleteGrade(0);
        Assert.assertEquals(0, this.student.getGrades().size());
    }


}
