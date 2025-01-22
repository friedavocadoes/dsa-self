import java.util.*;

public class longestConseq {

    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        int max = 1, oMax = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] - 1) {
                max++;
            } else if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                if (max > oMax)
                    oMax = max;
                max = 1;
            }

        }

        if (oMax > max)
            return oMax;
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 3, 2, 5, 4, 6, 1, 1 };

        System.out.println(longestConsecutive(arr));

    }
}