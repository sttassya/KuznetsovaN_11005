import java.util.Arrays;
import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                int n = in.nextInt();

                int [] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = in.nextInt();
                }

                Arrays.sort(a);

                System.out.println(find(in.nextInt(), a, 0, a.length - 1));
            }

            public static boolean find(int value, int [] a, int begin, int n) {
                int middle = begin + (n / 2);

                if (a[middle] > value) {
                    return find(value, a, begin, n / 2);
                }
                if (a[n] < value) {
                    return find(value, a, middle, n / 2);
                }
                if (a[n] == value) {
                    return true;
                }
                return false;
            }
        }

