import java.util.Scanner;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static String solution(String a) {
        String[] arr = a.split(" ");
        int max = 0;
        String result = null;
        for (String elem : arr ) {
            if (elem.length() > max) {
                max = elem.length();
                result = elem;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }
}
