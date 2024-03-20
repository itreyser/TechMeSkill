package lesson7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Figure[] figure = new Figure[5];

        for (int i = 0; i < figure.length; i++) {
            System.out.println("Введите номер фигуры, которую хотите записать в массив : 1 - Круг, 2 - Прямоугольник, 3 - Квадрат");
            int choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("Введите радиус круга: ");
                double radius = scan.nextDouble();
                figure[i] = new Circle(radius);
            } else if (choice == 2) {
                System.out.println("Введите ширину прямоудольника: ");
                double width = scan.nextDouble();
                System.out.println("Введите высоту прямоугольника: ");
                double height = scan.nextDouble();
                figure[i] = new Rectangle(width, height);
            }
            else{
                System.out.println("Введите сторону квадрата: ");
                double side = scan.nextDouble();
                figure[i] = new Square(side);
            }
        }

        double totalPerimeter = 0;
        for (Figure i : figure) {
            totalPerimeter += i.perimeter();
        }

        System.out.println("Сумма периметров всех фигур в массиве: " + totalPerimeter);


    }
}
