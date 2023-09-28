import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Scanner sh = new Scanner(System.in);

        do {
            System.out.println("Choose one shape to calculate area or perimeter: ");
            System.out.println("1. Rectangle\n2. Triangle\n3. Circle\n4. Square\n5. Exit" );
            int shape = sh.nextInt();

            if (shape == 1){

                System.out.println("Enter the width of rectangle: ");
                double width = sh.nextDouble();

                System.out.println("Enter the height of rectangle: ");
                double height = sh.nextDouble();

                Rectangle r = new Rectangle(width, height);
                System.out.println("This is the area of rectangle: " + r.getArea());
                System.out.println("This is the perimeter of rectangle: " + r.getPerimeter());

            } else if (shape == 2) {
                System.out.println("Enter the 1st side of triangle: ");
                double side1 = sh.nextDouble();

                System.out.println("Enter the 2nd side of triangle: ");
                double side2 = sh.nextDouble();

                System.out.println("Enter the 3rd side of triangle: ");
                double side3 = sh.nextDouble();

                Triangle t = new Triangle(side1, side2, side3);
                System.out.println("This is the area of triangle: " + t.getArea());
                System.out.println("This is the perimeter of triangle: " + t.getPerimeter());


            } else if (shape == 3) {
                System.out.println("Enter the radius of circle: ");
                double radius = sh.nextDouble();

                Circle c = new Circle(radius);
                System.out.println("This is the area of circle: " + c.getArea());
                System.out.println("This is the perimeter of circle: " + c.getPerimeter());

            } else if (shape == 4) {
                System.out.println("Enter the length of square: ");
                double length = sh.nextDouble();

                Square s = new Square(length);
                System.out.println("This is the area of square: " + s.getArea());
                System.out.println("This is the perimeter of square: " + s.getPerimeter());
            }else if (shape == 5){
                break;
            }else {
                System.out.println("Invalid input.");
            }
        } while (true);

        sh.close();

    }
}