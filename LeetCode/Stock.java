public class Stock {

    public static int maxProfit(int[] ar) {
        int l = 0, r = 1, prof = 0, nprof;
        while (l < r) {
            nprof = ar[r] - ar[l];
            if (nprof > prof) {
                prof = nprof;
                r++;
            } else if (nprof < 0) {
                l = r;
                r++;
            }
        }

        return prof;
    }

    public static void main(String[] args) {

        int[] arr = { 7, 1, 5, 3, 6, 4 };

        System.out.println(maxProfit((arr)));

    }
}