package codeForcesExercise;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int s = scan.nextInt();
		boolean[] answers = new boolean[s];
		for(int i = 0; i<s; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			answers[i] = isAncestor(x, y, arr);
		}
		scan.close();
		
		for(boolean ans: answers) {
			if(ans)
				System.out.println("yes");
			else 
				System.out.println("no");
		}
	}
	
	
	public static boolean isAncestor(int x, int y, int[] arr) {
		
		if(y == -1)
			return false;
		if(y == x)
			return true;
		return isAncestor(x, arr[y], arr);
	}

}
