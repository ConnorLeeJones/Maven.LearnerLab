package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor paul = new Instructor(1337L, "Paul");
        Instructor john = new Instructor(420L, "John");
        Instructor ringo = new Instructor(1010L, "Ringo");
        Instructor george = new Instructor(2994L, "George");
        personList.add(paul);
        personList.add(john);
        personList.add(ringo);
        personList.add(george);
        Educator paulEducator = Educator.PAUL;
        Educator johnEducator = Educator.JOHN;
        Educator ringoEducator = Educator.RINGO;
        Educator georgeEducator = Educator.GEORGE;


    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] getArr(){
        return this.personList.toArray(new Instructor[personList.size()]);
    }

}