package HW27;

import java.util.Scanner;

public class Round extends Shape {
    @Override
    public int getArea(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        int radius = in.nextInt();
        System.out.print("Введите длину окружности: ");
        int length = in.nextInt();
        System.out.print("Площадь окружности равна:  ");
        return (length*radius)/2;
    }
}
