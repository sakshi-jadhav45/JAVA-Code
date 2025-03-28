
abstract class Shape {
    double sideA, sideB;

    
    Shape(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    abstract double area();
}


class Rectangle extends Shape {

    Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    double area() {
        return sideA * sideB;
    }
}


class Triangle extends Shape {
   
    Triangle(double base, double height) {
        super(base, height);
    }

   
    @Override
    double area() {
        return 0.5 * sideA * sideB;
    }
}


public class ShapeDemo {
    public static void main(String[] args) {
      
        Shape rectangle = new Rectangle(12, 6);
        System.out.println("Area of Rectangle: " + rectangle.area());

     
        Shape triangle = new Triangle(8, 5);
        System.out.println("Area of Triangle: " + triangle.area());
    }
}
