package oopchallenge.service;

import oopchallenge.model.Course;
import oopchallenge.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CourseService {

    // property of Hashmap of students
    HashMap<String, Student> students = new HashMap<String, Student>();

    // property of Hashmap of courses
    HashMap<String, Course> courses = new HashMap<String, Course>();

    public CourseService(){

        // create a new HashMap of Students upon instantiating CourseService
        students.put("120120", new Student("Santiago", "Andres", 10 ,"120120"));
        students.put( "884545", new Student( "Kate", "Smith", 50 ,"884545" ));
        students.put( "458787", new Student( "Alejandra", "Thomas", 5, "458787" ));
        students.put( "135464", new Student( "Maria", "Simpson", 99 ,"135464" ));
        students.put( "778979", new Student( "Peter", "Thomas", 1, 0, 2,"778979" ));

        // create new HashMap of Courses upon instantiating CourseService
        courses.put("math_01", new Course("Mathematics 1", "math_01", 8));
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }

    // public method in CourseService to enroll student
    public void enrollStudent(String studentId, String courseId){
        // TODO
        Course course = courses.get(courseId);
        Student student = students.get(studentId);
        student.enroll(course);
    }

    public void enrollStudent(Student[] students){
        //TODO add all the students to the collection
        //TODO, MUST DO -AS YOUR OWN CHALLENGE AFTER TODAY'S SESSION
    }

    // public method in CourseService to un-enroll student
    public void unEnrollStudent(String studentId, String courseId){
        // TODO
        Course course = courses.get(courseId);
        Student student = students.get(studentId);
        student.unEnroll(course);
    }

    // public method in CourseService to display course information
    public void displayCourseInformation(String courseId){
        // TODO
        System.out.println(courses.get(courseId));
    }

    // public method in CourseService to display student information
    public void displayStudentInformation(String studentId){
        // TODO
        System.out.println(students.get(studentId));
    }

    // public method to display the course(s) student is enrolled into
    public void displayStudentCourseInformation(String studentId){
        // TODO
        // 1. Get the student by its courseId
        Student student = students.get(studentId);
        System.out.println(student);
        System.out.println(student.getEnrolledCourses());
    }

    // public method to display total course credits for student
    public void displayTotalStudentCredits(String studentId){
        Student student = students.get(studentId);
        ArrayList<Course> totalCourses = student.getEnrolledCourses();

        int total = 0;
        for (Course item : totalCourses) {
            total += item.getCredits();
        }

        System.out.println("Total Credits: " + total);
    }

    // public method to return the student by studentId
    public Student getStudent(String studentId){
        Student student = students.get(studentId);
        return student;
    }

    // public method to return the number of students
    public int countStudents(){
        // TODO implement
        return students.size();
    }

    // public method to return the best grades amongst students
    public int bestGrade(){
        //TODO implement
        int highestGrade = 0;

        for (Map.Entry<String, Student> entry: students.entrySet()) {
            Student student = entry.getValue();
            if(student.getGrade() > highestGrade){
                highestGrade = student.getGrade();
            }
        }

        return highestGrade;
    }

    // public method to showEnrolledStudents
    public void showEnrolledStudents(String courseId){
        //TODO implement using collections loops
        ArrayList<Student> enrolledStudents = new ArrayList<Student>();
        Course enrolledCourse = courses.get(courseId);

        students.forEach((studentId, student)->{
            ArrayList<Course> enrolledCourses = student.getEnrolledCourses();
            for (Course course: enrolledCourses) {
                // get the course based on courseId passed-in param
                if(course.getId().equals(courseId))
                    enrolledStudents.add(student);
            }
        });

        System.out.println("Enrolled students for course: " + enrolledCourse.getName());
        System.out.println("********************");
        enrolledStudents.forEach(student -> {
            System.out.println(student);
        });
    }

    // public method to showAllCourses
    public void showAllCourses(){
        //TODO implement using collections loops
        System.out.println("All available courses");
        courses.forEach((courseId, course)->{
            System.out.println(course);
        });
    }

}
