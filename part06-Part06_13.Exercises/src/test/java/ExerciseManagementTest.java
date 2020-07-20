import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {

        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {

        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExcerciseIsInList() {
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));

    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {    
        management.add("New exercise");    
        management.markAsCompleted("New exercise");    
        assertTrue(management.isCompleted("New exercise"));
        //this test fails because of the add method not correctly addeding im assumeing the beleow test doesnn't work as intened as well.
        // ill try to fix it and understand it sometime later. I spent too long loocking into it right now
    }
    
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {    
        management.add("New exercise");    
        management.markAsCompleted("New exercise");    
        assertFalse(management.isCompleted("Some exercise"));
    }
}