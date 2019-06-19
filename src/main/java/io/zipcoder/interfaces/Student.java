package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private Double totalStudyTime;

    public Student() {
        super();
        this.totalStudyTime = 0.0;
    }

    public Student(Long id, String name, Double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }


    public void learn(Double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime(){
        return this.totalStudyTime;
    }


}
