package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class JobTest {
    Job testJobOne;
    Job testJobTwo;

    @Before
    public void createJobObject() {
        testJobOne = new Job("Store Manager", new Employer("Clint's Comics"), new Location("Westport"), new PositionType("Comic Book Sorter"), new CoreCompetency("Friendly"));
        testJobTwo = new Job("El Hefe", new Employer("Mill's Records"), new Location("Broadway"), new PositionType("Record Cleaner"), new CoreCompetency("Precise"));
    }

    @Test
    public void testSettingJobId() {
        Assert.assertEquals(testJobOne.getId(), testJobTwo.getId(), 1);
        //This test should pass
        Assert.assertFalse(testJobOne.getName()==testJobTwo.getName());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertEquals("Product tester", testJob.getName());
        Assert.assertEquals("ACME", testJob.getEmployer().getValue());
        Assert.assertEquals("Desert", testJob.getLocation().getValue());
        Assert.assertEquals("Quality control", testJob.getPositionType().getValue());
        Assert.assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Assert.assertFalse(testJobOne.getId()==testJobTwo.getId());
    }
}
