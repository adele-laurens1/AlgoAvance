public class Puissance {

    static int puiss(int x, int n) {
        if (n==0) {
            return 1;
        }
        else {
            return x*puiss(x,n-1);
        }
    }

    public static void main(String[] var0) {
        System.out.println(puiss(2,3));
    }
}
