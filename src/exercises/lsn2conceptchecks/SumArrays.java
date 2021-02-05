<<<<<<< HEAD
package exercises.lsn2conceptchecks;
import java.util.ArrayList;
import java.util.Arrays;

public class SumArrays {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sumEven(numbers));
    }
        public static int sumEven(ArrayList<Integer> arr) {
        int sum = 0;
        for(int d: arr) {
            if (d % 2 == 0) {
                sum += d;
            }
        }
        return sum;
    }
}
=======
package exercises.lsn2conceptchecks;
import java.util.ArrayList;
import java.util.Arrays;

public class SumArrays {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sumEven(numbers));
    }
        public static int sumEven(ArrayList<Integer> arr) {
        int sum = 0;
        for(int d: arr) {
            if (d % 2 == 0) {
                sum += d;
            }
        }
        return sum;
    }
}
>>>>>>> origin/master
