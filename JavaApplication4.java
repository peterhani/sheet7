/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Asus
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Rectangle rectangle = new Rectangle(5.0, 10.0);
        Circle circle1 = new Circle(4.0);
        Circle circle2 = new Circle(6.0);

        System.out.println("Rectangle's area: " + rectangle.getArea());
        System.out.println("Rectangle's perimeter: " + rectangle.getPerimeter());

        System.out.println("Circle 1's area: " + circle1.getArea());
        System.out.println("Circle 1's perimeter: " + circle1.getPerimeter());

        System.out.println("Circle 2's area: " + circle2.getArea());
        System.out.println("Circle 2's perimeter: " + circle2.getPerimeter());

        int comparison = circle1.compareTo(circle2);
        if (comparison < 0) {
            System.out.println("Circle 1 has a smaller area than Circle 2.");
        } else if (comparison > 0) {
            System.out.println("Circle 1 has a larger area than Circle 2.");
        } else {
            System.out.println("Circle 1 and Circle 2 have the same area.");
        }
        }
    
}
