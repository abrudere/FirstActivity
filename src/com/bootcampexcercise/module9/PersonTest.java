package com.bootcampexcercise.module9;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
    protected void setUp() throws Exception {
        person = new Person();
        person.setWeight(60);
        person.setHeight(170);
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testGetandSet() {
        int weight = 60;
        float height = 170;
        assertEquals(person.getHeight(), height);
        assertEquals(person.getWeight(), weight);

        int newWeight = 110;
        float newHeight = 200;
        person.setWeight(newWeight);
        person.setHeight(newHeight);
        assertEquals(person.getHeight(), height);
        assertEquals(person.getWeight(), weight);
    }


    //TODO: create unit test for getBodyMassIndex method
    public void testBodyMassIndex() {

        double testDataBodyMassIndex = 0.0020761245395988226;

        assertEquals(person.getBodyMassIndex(), testDataBodyMassIndex);
    }
}
