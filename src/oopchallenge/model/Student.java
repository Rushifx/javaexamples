package oopchallenge.model;

import java.util.ArrayList;

public class Student {

    // properties of Student (default are private)
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    String id;

    // student can enroll in one OR more courses - thus a List or ArrayList is required
    ArrayList<Course> enrolledCourses = new ArrayList<Course>();

    // default constructor of Student
    public Student(String firstName, String lastName, int registration, int grade, int year, String id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
        this.id = id;
    }

    // overloaded constructor of Student
    public Student(String firstName, String lastName, int grade, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = 1;
        this.grade = grade;
        this.year = 1;
        this.id = id;
    }

    // overloaded constructor of Student
    public Student(){
        this.firstName = "";
        this.lastName = "";
        this.registration = 0;
        this.grade = 0;
        this.year = 1;
        this.id = "";
    }

    // getters() for Student
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getRegistration() {return registration;}
    public int getGrade() {return grade;}
    public int getYear() {return year;}
    public String getId() {return id;}

    // setters() for Student
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setRegistration(int registration) {this.registration = registration;}
    public void setGrade(int grade) {this.grade = grade;}
    public void setYear(int year) {this.year = year;}
    public void setId(String id) {this.id = id;}

    // override the default toString() method of the Student class
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" +
                    firstName + "\' " +
                "lastName='" +
                    lastName + "\'" +
                ", id='" +
                    id + "\'" + "}";
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

    // public method to print student full name
    // To print the object itself, use System.out.println(this.toString());
    public void printFullName(){
        //TODO implement
        System.out.println(firstName + " " + lastName);
    }

    // public method to return true if student grade is >= 60
    public boolean isApproved(){
        //TODO implement: should return true if grade >= 60
        return grade >= 60;
    }

    // public method to increase year by 1 if grade >= 60
    // and print Congratulations if student is approved
    public int changeYearIfApproved(){
        //TODO implement: the student should advance to the next year if he/she grade is >= 60
        // Make year = year + 1, and print "Congratulations" if the student has been approved
        if(this.isApproved()){
            year += 1; // equivalent to year = year + 1  OR  year++
            System.out.println("Congratulations");
        }
        return year;
    }
}
