import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main T = new Main();

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] result = T.solution(n);
		String printResult = "";

		for (int i = 0; i < n; i++) {
			if (i == i-1) {
				printResult += result[i];
			}
			printResult += result[i] + " ";
		}
		System.out.println(printResult);

	}

	public int[] solution(int n) {
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			if (i < 2) {
				a[i] = 1;
			} else {
				a[i] = a[i-2] + a[i-1];
			}
		}

		return a;

	}	
	
}