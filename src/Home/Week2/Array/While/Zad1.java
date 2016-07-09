package Home.Week2.Array.While;
import java.util.Scanner;

/**
 * Created by nastya on 03.07.16.
 */
public class Zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.in - console

        System.out.println("Input some int value");
        int res = sc.nextInt();

        while (res != 0) {
            System.out.println(" Vvesti eshe");
             res = sc.nextInt();
        }
    }
}
