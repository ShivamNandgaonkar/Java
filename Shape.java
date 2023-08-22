package Lab;
/*
 Create a superclass called "Shape" with properties like "numSides" and "color". 
 Create three subclasses "Triangle", "Square", and "Circle" that inherit from "Shape" and 
 have additional properties like "sideLengths" for triangle and square, and "radius" for the circle. 
 Write a Java program to display the details of a triangle, a square, and a circle.
 */
public class Shape 
{
    protected int numSides;
    protected String color;
    
    public Shape(int numSides, String color) 
    {
        this.numSides = numSides;
        this.color = color;
    }
    public void display()
    {
        System.out.println("Number of sides: " + numSides);
        System.out.println("Color: " + color);
    }
}
class Triangle extends Shape 
{
    protected int[] sideLengths;
    public Triangle(int[] sideLengths, String color)
    {
        super(3, color);
        this.sideLengths = sideLengths;
    }
    public void display()
    {
        super.display();
        System.out.println("Side lengths: " + sideLengths[0] + ", " + sideLengths[1] + ", " + sideLengths[2]);
    }
}
class Square extends Shape 
{
    private double sideLength;
    public Square(double sideLength, String color)
    {
        super(4, color);
        this.sideLength = sideLength;
    }
    public void display() 
    {
        super.display();
        System.out.println("Side length: " + sideLength);
    }
}
class Circle extends Shape 
{
    private double radius;
    public Circle(double radius, String color) 
    {
        super(0, color);//Circles have no sides
        this.radius = radius;
    }
    public void display()
    {
        super.display();
        System.out.println("Radius: " + radius);
    }
}
class ShapeMain 
 {
    public static void main(String[] args) 
    {
        Triangle t= new Triangle(new int[]{3, 4, 5}, "red");
        t.display();
        Square s = new Square(5, "blue");
        s.display();
        Circle c = new Circle(7, "green");
        c.display();
    }
}