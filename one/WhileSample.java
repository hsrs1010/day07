package com.java.one;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		String sn;

		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 q을 입력하세요.");
		
//		int n = sc.nextInt();
		sn=sc.next();
		while (true) {
			if (sn.equals("q")) {
				break;
			}
			int n1 = Integer.parseInt(sn);
			
			sum+=n1;
			count++;
			sn=sc.next();
			}
		if(count ==0)
			System.out.println("입력된 수가 없습니다.");
		
		else {	
			System.out.println("정수의 갯수는" + count + "개이며");
			System.out.println("평균은"+(double)sum/count + "입니다.");
		}
		sc.close();
	}
	
}