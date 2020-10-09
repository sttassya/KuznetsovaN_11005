import java.util.Scanner;
public class HomeWork3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[][] a = new int[n][n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        if (a[i][j] % 2 == 0) {
                            count++;
                        }
                    }
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    if (i == j) {
                        if (a[i][j] % 2 == 0) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count >= n / 2);
        }
    }

