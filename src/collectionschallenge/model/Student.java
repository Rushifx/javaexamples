package collectionschallenge.model;

import java.util.ArrayList;

public class Student {

    // properties of Student (default are private)
    String name;
    String id;

    // student can enroll in one OR more courses - thus a List or ArrayList is required
    ArrayList<Course> enrolledCourses = new ArrayList<Course>();

    // default constructor of Student
    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    // overloaded constructor of Student
    public Student(){
        this.name = "";
        this.id = "";
    }

    // getters() for Student to return name or id
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // setters() for student to store the name and id
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    // override the default toString() method of the Student class
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", id='" + id + '\'' + '}';
    }

    // public method to enroll student to a course
    public void enroll(Course course){
        enrolledCourses.add(course);
    }

    // public method to un-enroll student from a course
    public void unEnroll(Course course){
        enrolledCourses.remove(course);
    }

    // public method to return the number of courses student enrolled
    public int totalEnrolledCourses(){
        // returns the number of courses student is enrolled into
        return enrolledCourses.size();
    }

    // public method to return the enrolled courses' information
    public ArrayList<Course> getEnrolledCourses(){
        return enrolledCourses;
    }
}
