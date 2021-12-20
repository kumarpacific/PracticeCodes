public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 4;
        String s = "Source";
        String h = "Helper";
        String d = "destination";
        solve(s, d, h, n);
    }

    private static void solve(String s, String d, String h, int n) {

        if(n == 1){
            System.out.println("Moving plate "+ n +" from " + s + " to " + d);
            return;
        }

        solve(s,h,d,n-1);
        System.out.println("Moving plate "+ n +" from " + s + " to " + d);
        solve(h,d,s,n-1);

    }

}
