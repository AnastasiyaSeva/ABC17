package Home.Week2.Array.For.ArrayForCodingBat;
import java.util.Scanner;

/**
 * Created by nastya on 09.07.16.
 */
public class Array1 {
    public static void main(String[] args) {


    Scanner sc = new Scanner (System.in);
  System.out.println("Enter array leght");
        int size = sc.nextInt();


    int []array = new  int [size];
        for (int i = 0; i < array.length; i++)
        {
            array[i]=  i;

        }
        System.out.println();
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
}
}
