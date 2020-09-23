public class Factorielle{

    static int factorielle(int n){
        if(n==1){
        return 1;
        }

        else{
        return n*factorielle(n-1);
        }
        }

    public static void main(String[] var0) {
        System.out.println(factorielle(5));
    }
}

