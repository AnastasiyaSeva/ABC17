package Home.Week2.Array.While;
import ua.artcode.Utils.ArrayUtils;
import java.util.Scanner;

/**
 * Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
 */
public class Week2Home3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array leght");
        int size = sc.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            if ( i % 2 == 0 )
                array[i] = (int)(  Math.random() * 20 ) * 2 ;
           else
                array[i] = (int)(  Math.random() * 20) * 2 + 1  ;


        }
        ArrayUtils.printArray(array);

    }
}
