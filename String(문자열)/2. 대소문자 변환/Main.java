import java.util.Scanner;

public class Main {
    public static String solution(String a) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i))) {
                result.append(Character.toLowerCase(a.charAt(i)));
            } else {
                result.append(Character.toUpperCase(a.charAt(i)));
            }
        }

        return result.toString() ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));

    }
}
