import java.util.Scanner;

class Main {

    static int solution(String a, char b) {
        a = a.toUpperCase();
        b = Character.toUpperCase(b);
        int result = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(solution(str, c));
    }
}