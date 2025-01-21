import java.util.*;

class anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] Ss = s.toCharArray();
        char[] Tt = t.toCharArray();
        Arrays.sort(Ss);
        Arrays.sort(Tt);
        return Arrays.equals(Ss, Tt);
    }

    public static void main(String[] args) {
        String s = "apple", t = "elppa";
        System.out.println(isAnagram(s, t));
    }
}