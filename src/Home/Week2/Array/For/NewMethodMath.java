package Home.Week2.Array.For;
import java.util.Scanner;

/**
 * Created by nastya on 03.07.16.
 */
public class NewMethodMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 25;

        int sqrt = (int)Math.sqrt(number);
        System.out.println(sqrt);

        int pow = (int)Math.pow(sqrt,2);
        System.out.println(pow);

        System.out.println(Math.abs(-25));
        System.out.println((int)(Math.random()*100));

    }
}
