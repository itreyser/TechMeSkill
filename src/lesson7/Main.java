package lesson7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Figure[] figure = new Figure[5];
        System.out.println("Введите радиус круга: ");
        double radius = scan.nextDouble();
        figure[0] = new Circle(radius);
        System.out.println("Введите сторону квадрата: ");
        double side = scan.nextDouble();
        figure[1] = new Square(side);
        System.out.println("Введите ширину прямоудольника: ");
        double width = scan.nextDouble();
        System.out.println("Введите высоту прямоугольника: ");
        double height = scan.nextDouble();
        figure[2] = new Rectangle(width, height);

        double totalPerimeter = 0;
        for (Figure i : figure) {
            if (i == null) {
                continue;
            }
            totalPerimeter += i.perimeter();
        }

        System.out.println("Сумма периметров всех фигур в массиве: " + totalPerimeter);


    }
}
