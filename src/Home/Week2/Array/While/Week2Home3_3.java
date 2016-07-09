package Home.Week2.Array.While;
import java.util.Scanner;
import ua.artcode.Utils.ArrayUtils;

/**
 * Поменять местами наибольший  и наименьший элементы в массиве
 */
public class Week2Home3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array leght");

        int size = sc.nextInt();

      //   int array[] = new int[size];
         System.out.println("Enter array interval from a");
        int a = sc.nextInt();
         System.out.println("to b");
         int b = sc.nextInt();
        int [] array  = ArrayUtils.CreateAndFillRandomArray(size, a, b);
        ArrayUtils.printArray(array);

           int resultMin = array[0];
          int  resultMax = array[0],
            indexMin = 0,
            indexMax = 0;
        for (int i = 0; i < array.length; i++) {
          if (resultMin > array[i]) {
              resultMin = array[i];
              indexMin = i;
          }
        else if (resultMax < array[i]) {
                resultMax = array[i];
                indexMax = i; }
          }

               array[indexMin] = resultMax;
                   array[indexMax] = resultMin;

        System.out.println();
        ArrayUtils.printArray(array); ;
}
}






































