package io.zipcoder.interfaces;


public enum Educator implements Teacher {

    PAUL(new Instructor(1337L, "Paul"), 10.0),
    JOHN(new Instructor(420L, "John"), 20.0),
    RINGO(new Instructor(1010L, "Ringo"), 25.0),
    GEORGE(new Instructor(1010L, "George"), 30.0);


    private final Instructor instructor;
    private final Double timeWorked;

    Educator(Instructor instructor, Double timeWorked) {
        this.instructor = instructor;
        this.timeWorked = timeWorked;
         //Instructors.getInstance().add((instructor));

    }


    public void teach(Learner learner, Double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, Double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
    }

    public Instructor getInstructor() {
        return instructor;
    }
}
