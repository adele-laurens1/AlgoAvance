public class Palindrome {

    public static boolean estPalindromeAux(char[] var0, int var1, int var2) {
        if (var1 + 1 > var2 - 1) {
            return var0[var1] == var0[var2];
        } else {
            return var0[var1] == var0[var2] && estPalindromeAux(var0, var1 + 1, var2 - 1);
        }
    }

    boolean estPalindromeAux2(char[] var1, int var2, int var3) {
        if (var2 >= var3) {
            return true;
        } else {
            return var1[var2] == var1[var3] && estPalindromeAux(var1, var2 + 1, var3 - 1);
        }
    }

    public static boolean estPalindrome(char[] var0) {
        return var0.length == 0 ? true : estPalindromeAux(var0, 0, var0.length - 1);
    }

    public static void main(String[] var0) {
        char[] var1 = new char[]{'a', 'b', 'c', 'b', 'a'};
        System.out.println(estPalindromeAux(var1, 0, 3));
        System.out.println(estPalindrome(var1));
    }
}
