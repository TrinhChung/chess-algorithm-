import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void show(int i, int j, int k, int[] a) {
        System.out.println(a[i] + a[j] + a[k]);
    }
    public static void printArray(int[] a, int n){
        for(int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
    public static void ThreeSum(int[] a, int n){
        for(int i = 0; i < n; i++ ) {
            int f=i+1;
            int l=n-1;
            while(f<l) {
                System.out.println(1);
                if(a[i]+a[f]+a[l] == 30){
                    show(i,f,l,a);
                    break;
                }
                else{
                    if(a[i]+a[f]+a[l]>0){
                        l--;
                    }
                    else{
                        f++;
                    }
                }
            }
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);
        ThreeSum(a, n);
    }
}
