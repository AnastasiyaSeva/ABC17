package Home.Week2.Array.While;
import java.util.Scanner;

/**
 * Created by nastya on 03.07.16.
 */
public class Zad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input interval");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;

        while(  a < b)
        {  if (a%2 == 0)
        { System.out.println(" " +a);}


            a++;

        }


    }
}
