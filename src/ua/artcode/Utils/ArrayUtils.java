package ua.artcode.Utils;

/**
 * Created by nastya on 03.07.16.
 */
public class ArrayUtils {
    //return type -data type or void
    //methodName - verb
    // args - argsType argsName or without args


    //public static <return type> <methodName>(<args>)

    // return type - data type or void
    // methodName - verb
    // args - without args

    // public static <return type> <methodName>

      public static void printArray(int[]arr) {
          for (int i = 0; i < arr.length; i++) {
              System.out.print(" " + arr[i]);
          }
          System.out.println();
      }


    public static int[] CreateAndFillArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }



        public static int[] CreateAndFillRandomArray(int size, int min, int max){
            int [] array = new int[size];
            for (int i = 0; i < size; i++)
            {  array[i] = (int)( min + Math.random() * (max-min));
        }
            return array;}

    public static int[] CreateAndFillRandomArrayWithoutInterval(int size){
        int [] array = new int[size];
        for (int i = 0; i < size; i++)
        {  array[i] = (int)(  Math.random() * 100);
        }
        return array;
    }
}


