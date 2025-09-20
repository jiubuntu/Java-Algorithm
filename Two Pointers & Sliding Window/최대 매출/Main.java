import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = kb.nextInt();
		}

		System.out.println(T.solution(n, k, a)) ;

	}

	public int solution(int n, int k, int[] a) {
		int answer , sum = 0;
		for (int i = 0; i < k; i++) {
			sum += a[i];
		}
		answer = sum;

		for (int i = k; i < n; i++) {
			sum = sum + a[i] - a[i-k];
			if (sum > answer) {
				answer = sum;
			}
		}

		return answer;
	}
}