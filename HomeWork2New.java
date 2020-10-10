

import java.util.*;

public class HomeWork2New {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String [] array = new String[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.next();
        }

        sort(array);
        System.out.println(Arrays.deepToString(array));
    }

    public static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (isReversed(j, array)) {
                    String buf = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buf;
                }
            }
        }
    }

    public static boolean isReversed(int i, String[] array) {
        int size = Math.min(array[i].length(), array[i + 1].length());
        if (array[i].length() > size) {
            return true;
        }
        for (int j = 0; j < size; j++) {
            if (array[i].charAt(j) > array[i + 1].charAt(j)) {
                return true;
            }
            if (array[i].charAt(j) < array[i + 1].charAt(j)) {
                break;
            }
        }
        return false;
    }
}