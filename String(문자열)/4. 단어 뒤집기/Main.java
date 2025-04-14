import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> result = new ArrayList<>();
        for (String a : str) {
            String strbd = new StringBuilder(a).reverse().toString();
            result.add(strbd);
        }
        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }

        for (String a : T.solution(n, str)) {
            System.out.println(a);
        }

    }
}