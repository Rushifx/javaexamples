package abstractclass.shape;

import abstractclass.shape.model.Circle;
import abstractclass.shape.model.Triangle;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        circle.displayArea("Circle", circle.calculateArea());
        circle.displayPerimeter("Circle", circle.calculatePerimeter());

        Triangle triangle = new Triangle(10, 5, 11, 5);
        triangle.displayArea("Triangle", triangle.calculateArea());
        triangle.displayPerimeter("Triangle", triangle.calculatePerimeter());

    }

}
