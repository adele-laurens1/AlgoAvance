public class Croiss {
    public Croiss() {
    }

    public static boolean croissantsAux(int[] var0, int var1, int var2) {
        if (var0.length == var2) {
            return var0[var1] < var0[var2];
        } else {
            return var0[var1] < var0[var2] ? croissantsAux(var0, var1 + 1, var2 + 1) : false;
        }
    }

    public static boolean croissants(int[] var0) {
        return var0.length == 0 ? false : croissantsAux(var0, 0, var0.length);
    }

    public static void main(String[] var0) {
        int[] var1 = new int[]{1, 2, 3, 4, 5};
        System.out.println(croissantsAux(var1, 0, 3));
        System.out.println(croissants(var1));
    }
}
