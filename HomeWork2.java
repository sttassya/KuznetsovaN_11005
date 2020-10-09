import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s = in.nextLine().split(" ");
        TreeSet<String> tree = new TreeSet<>(Arrays.asList(s));
        for (int i = 0; i < tree.size(); i++) {
            System.out.print(tree.toArray()[i] + " ");
        }
    }
}