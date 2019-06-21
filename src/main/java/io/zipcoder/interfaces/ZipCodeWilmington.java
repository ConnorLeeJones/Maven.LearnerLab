package io.zipcoder.interfaces;

import java.util.HashMap;

public final class ZipCodeWilmington {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();
    private static final HashMap<Student, Double> studentMap = new HashMap<>();


    private ZipCodeWilmington(){
    }


    public void hostLecture(Teacher teacher, Double numberOfHours) {
//        Instructor thisInstructor = (Instructor) teacher;
//        if (instructors.contains(thisInstructor)) {
            teacher.lecture(students.getArray(), numberOfHours);
//        }
    }




    public void hostLecture(Long id, Double numberOfHours){
//        Instructor thisInstructor = (Instructor) instructors.findByID(id);
//        thisInstructor.lecture(students.getArray(), numberOfHours);

        Educator thisInstructor = Educator.valueOf(instructors.findByID(id).getName().toUpperCase());
        thisInstructor.lecture(students.getArray(), numberOfHours);
    }

    public HashMap<Student, Double> getStudyMap() {

        for (int i = 0; i < students.size(); i++) {
            studentMap.put(students.getArray()[i], students.getArray()[i].getTotalStudyTime());
        }
        return studentMap;
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
