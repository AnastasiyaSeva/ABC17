package Home.Week2.Array;

/**
 * Created by nastya on 03.07.16.
 */
public class FindArifmeticAverige {
    public static void main(String[] args) {
        int arr [] = {29,18,17,29,13,14,10};
        int i;
        int res = 0;
        int aver = 0;
        for (i = 0; i != arr.length; i++)
        {
            aver =  aver + arr[i];}
        res = aver/arr.length;
            System.out.println(" " + res );
        }

    }

