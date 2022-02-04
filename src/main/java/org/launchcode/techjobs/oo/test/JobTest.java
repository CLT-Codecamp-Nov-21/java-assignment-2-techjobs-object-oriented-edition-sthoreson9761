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
        assertEquals("ACME", test_job.getName());
        assertTrue(test_job instanceof Job);
        assertEquals("Product tester", test_job.getName());

    }

}
