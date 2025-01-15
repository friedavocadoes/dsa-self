package math;

import java.util.Arrays;

public class digitCount {

    static int counter(int n) {
        int count = 0;
        int t = n;
        while (n > 0) {
            count++;
            n /= 10;
        }

        int[] arr = new int[count];
        int i = count - 1;
        while (t > 0) {
            arr[i] = t % 10;
            i--;
            t /= 10;
        }

        System.out.println(Arrays.toString(arr));

        return count;
    }

    public static void main(String[] args) {
        int n = 456;
        // System.out.println(counter(n));

        // loga N = log N / log a
        int count = (int) (Math.log(n) / Math.log(10)) + 1;
        System.out.println(count);
    }
}
