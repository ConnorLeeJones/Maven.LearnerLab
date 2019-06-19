package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    PAUL(new Instructor(1337L, "Paul")),
    JOHN(new Instructor(420L, "John")),
    RINGO(new Instructor(1010L, "Ringo")),
    GEORGE(new Instructor(1010L, "Ringo"));


    private final Instructor instructor;


    Educator(Instructor instructor) {
        this.instructor = instructor;
    }



    @Override
    public void teach(Learner learner, Double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {

    }
}
