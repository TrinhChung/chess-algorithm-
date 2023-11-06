import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static int maxCost(List<Integer> cost, List<String> labels, int dailyCount) {
        int max = 0;//0 3 2 3 4  legal legal illegal legal legal
        int d = dailyCount;
        int c = 0;
        for(int i = 0; i < cost.size(); i++) {
            if (d == 0 && labels.get(i).equals("legal")) {
                d = dailyCount;
                c = 0;
            }

            if (d == 0 && labels.get(i).equals("illegal")) {
                c += cost.get(i);
            }
            if (d > 0 && labels.get(i).equals("legal")) {
                d--;
                c+= cost.get(i);
            }
            if (d > 0 && labels.get(i).equals("illegal")) {
                c+= cost.get(i);
            }
            if (c > max) {
                max = c;
            }
        }
        return max;
    }

    public static long UCLN(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            return a + b;
        } else {
            return UCLN(b, a % b);
        }
    }

    public static long nearlySimilarRectangles(List<List<Long>> sides) {
        List<String> c = new ArrayList<>();
        int[] t = new int[10000];
        for (int i = 0; i < 10000; i++) {
            t[i] = 1;
        }
        int count = 0;
        for (int i = 0; i < sides.size(); i++) {
            long a = sides.get(i).get(0);
            long b = sides.get(i).get(1);
            Math.
            String s = a/(UCLN(a, b)) + "/" + b/UCLN(a, b);
            if (!c.contains(s)) {
                c.add(s);
            } else {

                t[i] ++;
            }
        }







        return count;
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        List<Integer> cost = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            cost.add(sc.nextInt());
//        }
//        n = sc.nextInt();
//        List<String> labels = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            labels.add(sc.next());
//        }
//        int dailyCount = sc.nextInt();
//
//        System.out.println(maxCost(cost,labels,dailyCount));
        System.out.println(1/(2*1.0));
    }
}
