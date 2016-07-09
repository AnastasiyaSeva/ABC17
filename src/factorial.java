/**
 * Created by nastya on 02.07.16.
 */

import java.util.Scanner;

import static java.lang.Math.*;


public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        float a = sc.nextInt();
        int i;
        int factor;
        factor = 1;

        for (i = 1; i <= a; i++) {
            factor *= i;
        }
        System.out.println("a!= " + factor);

    }
}
