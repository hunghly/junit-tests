import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CohortTest {
    Cohort emptyCohort;
    Cohort oneCohort;
    Cohort manyCohort;

    @Before
    public void setUp() {
        emptyCohort = new Cohort();
        oneCohort = new Cohort();
        manyCohort = new Cohort();

        Student hung = new Student("hung", 123);
        Student joe = new Student("joe", 111);
        Student flow = new Student("flow", 333);
        hung.addGrade(100);
        joe.addGrade(90);
        flow.addGrade(90);

        oneCohort.addStudent(hung);
        manyCohort.addStudent(hung);
        manyCohort.addStudent(joe);
        manyCohort.addStudent(flow);
    }

    @Test
    public void testGetCurrentList() {
        Assert.assertEquals(0, emptyCohort.getCurrentList().size());
        Assert.assertEquals(1, oneCohort.getCurrentList().size());
        Assert.assertEquals(3, manyCohort.getCurrentList().size());
    }

    @Test
    public void testGetAverage() {
        Assert.assertEquals(93.33, manyCohort.getAverage(), .5);
    }

    @Test
    public void testFindStudentById() {
        Assert.assertEquals(manyCohort.cohortList.get(0).getName(), manyCohort.findStudentById(123).getName());
    }
}
