import java.util.Scanner;

public class Home23_2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        num(a,b);
    }
    private static void num(int a, int b){
        if(a<=b){
            System.out.println(a);
            a++;
        }
    else{
        return;
        }
    num( a, b );
    }
}
