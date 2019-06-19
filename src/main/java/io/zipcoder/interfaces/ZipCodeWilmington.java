package io.zipcoder.interfaces;

public final class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();


    private ZipCodeWilmington(){
    }

    
    public void hostLecture(Teacher teacher, Double numberOfHours) {
        Instructor thisInstructor = (Instructor) teacher;
        if (instructors.contains(thisInstructor)) {
            thisInstructor.lecture(students.getArray(), numberOfHours);
        }
    }






    public void hostLecture(Long id, Double numberOfHours){
        Instructor thisInstructor = (Instructor) instructors.findByID(id);
        thisInstructor.lecture(students.getArray(), numberOfHours);
    }


    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

}
