package Home.Week2.Array.While;
import java.util.Scanner;

/**
 * Created by nastya on 03.07.16.
 */
public class Zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int a = sc.nextInt();
        int i = 1;
        while (i < a) {

            i++;
            System.out.println("  " + i);
        }
    }
}
