public class waterBucket {

    public static int minS(int n, int m) {
        if (m > n)
            return n;
        return m;
    }

    public static int maxArea(int[] ar) {
        int i = 0, j = ar.length - 1, max = 0;
        while (i < j) {
            int nMax = (j - i) * minS(ar[i], ar[j]);
            if (max < nMax)
                max = nMax;

            if (ar[i] < ar[j])
                i++;
            else
                j--;
        }

        return max;
    }

    public static void main(String[] args) {

        int[] ar = { 1, 7, 2, 5, 4, 7, 3, 6 };

        System.out.println(maxArea(ar));
    }
}
