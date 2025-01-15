import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int startIndex = input.indexOf('*');
        int endIndex = input.lastIndexOf('*');
        if (startIndex != -1 && endIndex != -1) {
            System.out.println(input.substring(startIndex + 1, endIndex));
        } else {
            System.out.println("No * found in the string");
        }

        sc.close();
    }
}
