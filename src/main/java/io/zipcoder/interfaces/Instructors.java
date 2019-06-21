package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        personList.add(Educator.PAUL.getInstructor());
        personList.add(Educator.JOHN.getInstructor());
        personList.add(Educator.RINGO.getInstructor());
        personList.add(Educator.GEORGE.getInstructor());
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] getArr(){
        return this.personList.toArray(new Instructor[personList.size()]);
    }

}