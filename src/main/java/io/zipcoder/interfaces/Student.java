package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    public double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
