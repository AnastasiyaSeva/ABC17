package Home.Week2.Array;

/**
 * Created by nastya on 02.07.16.
 */
public class ZadsizeTask2 {
    public static void main(String[] args) {
        int size = 20;
        System.out.println("start range");
        int start = 5;

        System.out.println(" end range");
        int end = 15;

        int[] arr = new int[size];
        int i = start;

        if (i % 2 == 0) {
            i += 1;
        }
        System.out.println("Reversed array");
        for(int j = arr.length - 1; j >= 0; j--){
                        System.out.print(arr[j] + " ");
            	        }

    }
}
