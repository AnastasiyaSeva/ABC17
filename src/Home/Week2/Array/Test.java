package Home.Week2.Array;
import ua.artcode.Utils.ArrayUtils;


/**
 * Created by nastya on 09.07.16.
 */
public class Test {
    public static void main(String[] args) {
        int [] array  = ArrayUtils.CreateAndFillRandomArray(10, 20, 130);
        ArrayUtils.printArray(array);
    }
}
