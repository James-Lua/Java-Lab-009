public class StringPlayground {

    public static void main(String[] args) {
        printer("((3 + 7) * 2)");
        printer("(3 + 7) * 2)");
        printer("(((3 + 7) * 2)");
        printer(")(3 + 7) * 2(");
        printer("((((((   )(())(( (((( [][][{}{}{}");
        printer(")))))))))))         ))))))))))            (#@($*^(@#*!                      )");
        printer("any string");
    }

    public static int parenthesesBalance(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') { count++; }
            else if (c == ')') { count--; }
        }
        return count;
    }

    public static void printer(String s) {
        System.out.println("Count for '" + s + "': " + parenthesesBalance(s));
    }
}