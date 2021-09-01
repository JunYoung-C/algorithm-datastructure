package chap03;

import java.util.Scanner;

public class SeqSearch {

	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while (true) {
			if (i == n) 
				return -1;
			if (a[i] == key)
				return i;
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x, num, ky);
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습ㄴ디ㅏ.");
		else 
			System.out.println(ky + "은 x[" + idx + "]에 있습니다");
	}

}
