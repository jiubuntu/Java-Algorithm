import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] strNumbers = br.readLine().split(" ");
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        Arrays.sort(numbers);

        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k <= i; k++) {
                result += numbers[k];
            }
        }

        bw.write(String.valueOf(result));

        bw.flush();
        br.close();
        br.close();

    }
}