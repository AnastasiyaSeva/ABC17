package ua.artcode.week1;
import java.util.Scanner;

/**
 * Created by nastya on 27.06.16.
 */
public class TestScanner {   public static void main(String[] args) {
    // create Scanner using "new" word
    Scanner sc = new Scanner(System.in);
    // System.in - console

   System.out.println("Input some int value");
    int res = sc.nextInt(); // get int from console
    System.out.println("Your value = " + res);

    System.out.println("Input some word");
    String word = sc.next();
    System.out.println("Your word is " + word);



}
}

