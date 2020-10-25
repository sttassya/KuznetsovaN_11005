import java.util.Scanner;

public class Home23_3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n = n*2;
        long k1 = 0;
        long k2 = 1;
        long k3 = 0;
        fibonachi (k1, k2, n, k3);
    }
    private static void fibonachi( long k1, long k2, int n , long k3){
        if ( n!= 0){
            n--;
            k3 = k1 + k2;
            k1 = k2;
            k2 = k3;
        }
        else{
            System.out.println(k3);
            return;
        }
        fibonachi(k1, k2, n , k3);
    }
}
