package com.java.one;

public class ForTest {
	public static void main(String[] args) {
//		while (true) {
//			//무한루프
//			System.out.println("무한출력");
//		}
		int i=0;
		for (;;) {
			System.out.println("????"+i);
			i++;
			if (i==10) {
				break;
			}
		}
	}

}
