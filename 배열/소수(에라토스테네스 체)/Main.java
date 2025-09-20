import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		T.solution(n);
	}

	public void solution(int n) {
		int[] ch = new int[n+1];
		int answer = 0;
		for (int i = 2; i <= n ; i++) {
			if (ch[i] == 0) {
				answer ++;
				for (int j = i; j <= n; j += i) {
					ch[j] = 1;
				}
			} 
		}
		System.out.println(answer);

		
	}
}