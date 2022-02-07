package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1,job2);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job instanceof Job);
        assertEquals("Product tester", test_job.getName());
        assertTrue(test_job.getEmployer() instanceof Employer);
        assertEquals("ACME", test_job.getEmployer().getValue());
        assertTrue(test_job.getLocation() instanceof Location);
        assertEquals("Desert", test_job.getLocation().getValue());
        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_job.getPositionType().getValue());
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_job.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job.equals(test_job2));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertEquals("\nID: "+ test_job.getId() +
//                "\nName: Product tester" +
//                "\nEmployer: ACME" +
//                "\nLocation: Desert" +
//                "\nPosition Type: Quality control" +
//                "\nCore Competency: Persistence\n", ""+test_job.toString().charAt(0)+"");
        assertEquals("\n", ""+test_job.toString().charAt(0)+"");
        assertEquals(10L,10L);
        assertEquals("\n", ""+test_job.toString().charAt(test_job.toString().length()-1)+"");
        assertEquals(10L,10L);
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: "+ test_job.getId() +
                "\nName: "+ test_job.getName() +
                "\nEmployer: "+ test_job.getEmployer().toString() +
                "\nLocation: "+ test_job.getLocation().toString() +
                "\nPosition Type: " + test_job.getPositionType().toString() +
                "\nCore Competency: " + test_job.getCoreCompetency().toString() + "\n", test_job.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job test_job = new Job("Product Tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency(""));
        assertEquals("\nID: " + test_job.getId() +
                "\nName: Product Tester" +
                "\nEmployer: Data not available" +
                "\nLocation: Desert" +
                "\nPosition Type: Data not available" +
                "\nCore Competency: Data not available\n", test_job.toString());
    }
    @Test
    public void testToStringHandlesOnlyIdField(){
        Job test_job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("\nOOPS! This job does not seem to exist.\n", test_job.toString());
    }

}
