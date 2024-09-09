package abstractclass.shape.model;

public class Triangle extends Shape{

    // TODO variable x 3 sides
    float base;
    float height;
    float side1;
    float side2;

    // TODO: constructor to store the sides of the triangle

    public Triangle(float base, float height, float side1, float side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    // TODO: public method to calc. the area of the triangle
    @Override
    public float calculateArea() {
        return (float) (0.5 * base * height);
    }

    // TODO: public method to calc. the perimeter of the triangle
    @Override
    public float calculatePerimeter() {
        return (float) (base + side1 + side2);
    }
}
