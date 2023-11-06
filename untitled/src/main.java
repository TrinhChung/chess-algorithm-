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
            if (d > 0 && labels.get(i).equals("legan")) {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> cost = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cost.add(sc.nextInt());
        }
        n = sc.nextInt();
        List<String> labels = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            labels.add(sc.next());
        }
        int dailyCount = sc.nextInt();

        System.out.println(maxCost(cost,labels,dailyCount));
    }
}
