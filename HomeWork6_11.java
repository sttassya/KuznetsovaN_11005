import java.util.Scanner;
public class HomeWork6_11 {
        public static Scanner in = new Scanner(System.in);
        public static void main(String[] args) {
            Vector2D v1 = new Vector2D();
            Vector2D v2 = new Vector2D();
            v1.setX(in.nextDouble());
            v1.setY(in.nextDouble());
            v2.setX(in.nextDouble());
            v2.setY(in.nextDouble());
            System.out.println("Add:");
            v1.add(v2);
            System.out.println("Substract:");
            v1.substract(v2);
            System.out.println("Multiply:");
            v1.multiply(in.nextInt());
        }
    }

    class Vector2D {
        public Vector2D(){}
        private double x;
        private double y;

        public void add(Vector2D v1) {
            Vector2D v2 = new Vector2D();
            v2.setX(this.x + v1.getX());
            v2.setY(this.y + v1.getY());
            System.out.println(v2.getX() + " " + v2.getY());
        }
        public void substract(Vector2D v1) {
            Vector2D v2 = new Vector2D();
            v2.setX(this.x - v1.getX());
            v2.setY(this.y - v1.getY());
            System.out.println(v2.getX() + " " + v2.getY());
        }
        public void multiply(int k) {
            Vector2D v2 = new Vector2D();
            v2.setX(this.x * k);
            v2.setY(this.y * k);
            System.out.println(v2.getX() + " " + v2.getY());
        }
        public double getX() {
            return x;
        }
        public void setX(double x) {
            this.x = x;
        }
        public double getY() {
            return y;
        }
        public void setY(double y) {
            this.y = y;
        }
    }
