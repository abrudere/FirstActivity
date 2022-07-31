package com.bootcampexcercise.module9;

import junit.framework.TestCase;
import org.junit.Assert;

public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
    protected void setUp() throws Exception {
        person = new Person();
        super.setUp();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
        public void testGetWeight() {
            int weight=60;
            person.setWeight(weight);
            Assert.assertEquals(weight,person.getWeight());

            int weight1 = 80;
            person.setWeight (weight1);
            Assert.assertNotEquals(weight, person.getWeight());
        }
        public void testGetHeight(){
            float height=170;
            person.setHeight(height);
            Assert.assertEquals(height, person.getHeight(),0);

            int height1 = 195;
            person.setHeight (height1);
            Assert.assertNotEquals(height, person.getHeight());
        }


    //TODO: create unit test for getBodyMassIndex method
//    public void testBMI() {
//
//        double testDataBodyMassIndex = 0.0020761245395988226;
//
//        assertEquals(person.calculateBodyMass(), testDataBodyMassIndex);
//    }
}
