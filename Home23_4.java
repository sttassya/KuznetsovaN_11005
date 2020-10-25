import java.util.Scanner;

public class Home23_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Функция Аккермана: ");
        int m = in.nextInt();
        int n = in.nextInt();
        int x = acerman(m, n);
        System.out.print(x);
    }

    private static int acerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if ((m > 0) && ( n == 0)){
            return acerman(m-1, 1 );
        }
             return acerman(m-1, acerman(m, n-1));

    }

}
