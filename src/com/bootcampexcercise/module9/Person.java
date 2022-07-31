package com.bootcampexcercise.module9;

public class Person {
    private int weight;
    private float height;

    //TODO: Create getters and setters for weight and height

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String calculateBodyMass() {
        if (this.height <= 0 || this.weight <= 0)
            return "Height and weight can not be zero";
        if (this.height > 2.5)
            return "Height cannot be greater than 2.5 meters";
        if (this.weight > 150)
            return "Please, go to the gym";
        return "Your BMI is " + this.weight/(this.height * this.weight);

        //TODO: Create a method to calculate humans body mass index with two parameters for height and weight

        //TODO: return String which indicates persons BMI. Calculation should be used weight/(height*height)

        // TODO: Please add some checks for max weight and height (kg and meter are their units)
        //TODO: Also add some checks that value shouldn't be negative and 0
//    Note: All TODOs should be implemented in single method
    }
}
