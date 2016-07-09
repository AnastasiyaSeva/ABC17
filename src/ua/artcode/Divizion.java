package ua.artcode;
import java.util.Scanner;

/**
 * Created by nastya on 01.07.16.
 */
public class Divizion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("vvedite a ");
        float a = sc.nextInt();

        System.out.println("vvedite b ");
        float b = sc.nextInt();
        float c = a/b;

        if (a % b == 0) {
            System.out.println("True ravna " + c);
        } else {
            System.out.println("False i ravna " + c);
        }
    }
}
