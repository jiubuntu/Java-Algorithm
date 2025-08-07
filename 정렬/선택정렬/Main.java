import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {5,2,4,9,10};
        solution(arr, arr.length);
        
        System.out.println(Arrays.toString(arr));
        
    }

    private static void solution(int[] arr, int len) {
        for (int i = 0; i < len; i ++) {
            int minIdx = i;
            for (int j=i+1; j < len; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
            
        }
    }
}