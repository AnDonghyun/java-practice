public class Venus {
    public static void main(String[] args) {
        int [] x = {1,2,3};
        int y[] = {4,5,6};
        new Venus().go(x,y);
        // System.out.println(y[0]);
    }
    void go(int[]... z) {
        for(int[] a : z)
            System.out.println(a[0]);
        System.out.println(z[1][2]);
    }
}
