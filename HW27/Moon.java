package HW27;

import java.awt.*;

public class Moon {
    public static void main(String[] args) {
        Round round = new Round();
        Star star =  new Star();
        Triangle triangle = new Triangle();
        Shape[] shapes = new Shape[6];
        shapes[0] = star;
        shapes[1] = round;
        shapes[2] = star;
        shapes[3] = triangle;
        shapes[4] = triangle;
        shapes[5] = round;
        for (int i = 0; i< shapes.length-1; i++){
            System.out.println(shapes[i].getArea());
        }
    }
}

