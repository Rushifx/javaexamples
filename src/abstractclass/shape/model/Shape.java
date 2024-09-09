package abstractclass.shape.model;

public abstract class Shape {

    // method signature to calculate area
    public abstract float calculateArea();

    // method signature to calculate perimeter
    public abstract float calculatePerimeter();

    // method definitions for classes that extends the Shape class
    public void displayPerimeter(String type, float value){
        System.out.println(type + " Perimeter: " + value);
    }

    public void displayArea(String type, float value){
        System.out.println(type + " Area: " + value);
    }
}
