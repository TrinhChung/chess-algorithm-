import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class App {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> a = new ArrayDeque<>();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if (t == 1) {
                a.add(sc.nextInt());
            } else if ( t == 2) {
                a.remove();
            } else {
                System.out.println(a.peek());
            }
        } 
    }
}
