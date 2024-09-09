package oopchallenge;

import oopchallenge.service.CourseService;
import oopchallenge.model.Student;

public class Main {
    public static void main(String[] args) {

        CourseService courseService = new CourseService();

        String courseId = "biol_01";
        String courseId2 = "phys_01";
        String courseId3 = "art_01";
        String studentId = "120120";

        courseService.enrollStudent(studentId, courseId);
        courseService.enrollStudent(studentId, courseId2);
        courseService.enrollStudent(studentId, courseId3);

        courseService.displayStudentCourseInformation(studentId);
        courseService.displayTotalStudentCredits(studentId);

        courseService.displayStudentInformation(studentId);
        courseService.displayCourseInformation(courseId);

        // run printFullName to print student of ID 120120
        Student student = courseService.getStudent(studentId);
        student.printFullName();

        // display the number of students in this program
        System.out.println(courseService.countStudents());

        // display the highest grade from all the students
        System.out.println("Highest Grade is:" + courseService.bestGrade());

        // TODO call overloaded function enrollStudent
        // TODO to store multiple students (as an array) in one go

        String studentId2 = "884545";
        courseService.enrollStudent(studentId2, courseId);
        courseService.enrollStudent(studentId2, courseId2);
        courseService.enrollStudent(studentId2, courseId3);
        courseService.displayStudentCourseInformation(studentId2);

        // display students who have taken the course phys_01
        courseService.showEnrolledStudents("phys_01");

        // display students who have taken the course art_01
        courseService.showEnrolledStudents("art_01");

        // display students who have taken the course art_01 (returns no student)
        courseService.showEnrolledStudents("math_01");

        // display all available courses
        courseService.showAllCourses();
    }
}