package collectionschallenge;

import collectionschallenge.service.CourseService;

public class Main {
    public static void main(String[] args) {

        CourseService courseService = new CourseService();

        String courseId = "biol_01";
        String courseId2 = "phys_01";
        String courseId3 = "art_01";
        String studentId = "778979";

        courseService.enrollStudent(studentId, courseId);
        courseService.enrollStudent(studentId, courseId2);
        courseService.enrollStudent(studentId, courseId3);

        courseService.displayStudentCourseInformation(studentId);
        courseService.displayTotalStudentCredits(studentId);

        courseService.displayStudentInformation(studentId);
        courseService.displayCourseInformation(courseId);
    }
}