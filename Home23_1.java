import java.util.Scanner;

public class Home23_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        System.out.println(factorial(k));

    }

    private static int factorial(int k) {
        if (k==1){
            return 1;
        }
        return k*factorial(k-1);
    }
}
