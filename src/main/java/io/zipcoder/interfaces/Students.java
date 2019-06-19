package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students(){
        Student con = new Student(1337L, "Con", 400.0);
        Student henry = new Student(420L, "Henry", 300.0);
        Student anish = new Student(1010L, "Anish", 20.0);
        Student ben = new Student(2994L, "Ben", 350.0);
        personList.add(con);
        personList.add(henry);
        personList.add(anish);
        personList.add(ben);
    }

    public static Students getInstance(){
        return INSTANCE;
    }



    public Student[] getArray(){
        return this.personList.toArray(new Student[personList.size()]);
    }







}
