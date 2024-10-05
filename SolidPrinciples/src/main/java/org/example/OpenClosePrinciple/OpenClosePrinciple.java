//as per this princple a class should be open for extention but closed for modification
//you should be able to add new functionality without breaking the existing code

package org.example.OpenClosePrinciple;

public class OpenClosePrinciple {
}
// Shape interface
interface Shape {
    // Placeholder for common behavior
}

// Rectangle class
class Rectangle implements Shape {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

// Circle class
class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}

// AreaCalculator class
class ErrorAreaCalculator {
    public double calculateArea(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.width * rectangle.height;
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        }
        return 0;
    }
}

// Shape interface with an area calculation method
interface CorrectShape {
    double calculateArea();
}

// Rectangle class implementing the Shape interface
class CorrectRectangle implements CorrectShape {
    public double width;
    public double height;

    public CorrectRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Circle class implementing the Shape interface
class CorrectCircle implements CorrectShape {
    public double radius;

    public CorrectCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle class implementing the Shape interface
class CorrectTriangle implements CorrectShape {
    public double base;
    public double height;

    public CorrectTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// AreaCalculator class does not need modification for new shapes
class CorrectAreaCalculator {
    public double calculateTotalArea(CorrectShape[] shapes) {
        double totalArea = 0;
        for (CorrectShape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}


