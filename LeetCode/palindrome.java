public class palindrome {
    public static boolean isAlphaNum(char c) {
        if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            return true;
        return false;

    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        // s = s.replaceAll("[^a-z0-9]", "");

        int l = 0, r = s.length() - 1;
        while (l < r) {

            while (!isAlphaNum(s.charAt(l)) && l < r) {
                l++;
                System.out.println("added");
            }

            while (!isAlphaNum(s.charAt(r)) && l < r) {
                r--;
                System.out.println("subd");
            }

            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
