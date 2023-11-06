public class powerSum {


    public static int checkSum(int k,int n, int[] a) {
        int m=0;
        for(int i=0;i<=k;i++){
            m+=Math.pow(a[i],n);
        }
        return m;
    }

    public static boolean check(int k,int i, int[] a) {
        for(int j=0;j<k;j++){
            if(i<=a[j]) return false;
        }
        return true;
    }
    public static void sum(int k, int x, int n, int c, int[] a) {

        for(int i=1;i<=Math.pow(x,1.0/n);i++) {
            if (check(k, i, a)) {
                a[k] = i;
                if (checkSum(k, n, a) == x) {
                    a[99]++;
                } else {
                    if (checkSum(k, n, a) < x) {
                        sum(k + 1, x, n, c, a);
                    } else {
                        continue;
                    }
                }
            }
        }
    }
    public static int powerSum(int x, int n) {
        int[] a=new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = 0;
        }
        sum(0,x,n,0,a);
        return a[99];
    }
    public static void main(String[] args) {
        int x, i;
        System.out.println(powerSum(10,2));
    }
}
