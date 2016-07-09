package Home.Week2.Array.While;
import ua.artcode.Utils.ArrayUtils;
import java.util.Scanner;
import java.util.*;


/**
 * Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
 который получается в результате суммы arr1[i] + arr2[i]
 */
public class Week2Home3_7 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7};
        int arr1[] = {9, 5, 3};
        int arr2[] = {0, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = (arr[i] + arr1[i]);
        }
        ArrayUtils.printArray(arr2);
    }
}
