import java.util.*;

public class arr {
    public static void main(String[] args) {
        System.out.print("Please enter size of arr: ");
        var sc = new Scanner(System.in);
        var k = sc.nextInt();

        var arr = new int[k];
        for (var i = 1; i <= k; i++) {
            arr[i - 1] = i;
        }
        // prints the length of the array
        System.out.println(arr.length);
        // prints the address of the array
        System.out.println(arr.toString());
        // print whole array
        System.out.println(Arrays.toString(arr));

        // To print the whole array, you can use a for loop to iterate through each
        // element and print it
        for (var i : arr) {
            System.out.print(i + " ");
        }
        // close the scanner
        sc.close();
    }
}