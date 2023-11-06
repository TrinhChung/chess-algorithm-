import java.util.*;

public class main {
    static boolean isBalanced(String a) {
        if (a.length() % 2!= 0) return false;
        Stack<Character> f = new Stack<>();

        for (int i = 0; i < a.length();i++) {
            if (a.charAt(i) == '{' || a.charAt(i) == '(' || a.charAt(i) == '[' ) {
                f.push(a.charAt(i));

            } else {
                char x = a.charAt(i);
                char y = f.pop();
                if ((x == '}' && y!= '{') || (x == ']' && y!= '[') || (x == ')' && y!= '(')) return  false;
            }
        }


        return  true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       System.out.println(isBalanced(s));
    }
}
