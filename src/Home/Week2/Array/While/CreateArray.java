package Home.Week2.Array.While;
import java.util.Scanner;

/**
 * Created by nastya on 03.07.16.
 */
public class CreateArray {
    public static void main(String[] args) {


        int size;
        int i;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        size = in.nextInt();
        int  arr[] = new int  [size];
        for( i =0;i < arr.length; i++, size--)
       /* for ( i = 0; i < arr.length; i++)
        {
            arr[i ] = size - i;

        }*/
        for ( i = 0; i < arr.length; i++)
        {
            System.out.println("  "+arr[i]);
        }
    }
}
