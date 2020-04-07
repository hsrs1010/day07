package com.java.one;

import java.util.Scanner;

public class ArrayAccess2 {
	public static void main(String[] args) {
		// max 값출력, min 출력
		Scanner sc = new Scanner(System.in);

		int intArray[] = new int[5];
		int max = 0;
		int min = 0;
		System.out.println("정수 5개만 입력");
		// for문으로 배열에 데이터 입력
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
			// max를 계산하기

			if (intArray[i] > max) {
				max = intArray[i];// max=intArray[i] ->
			}
			if (intArray[i]<min) {
				min=intArray[i];
			}
			
			else{
				min = intArray[i];
			}
		}
		// max 출력
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		// for 문으로 배열의 데이터 출력
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);

		}
	}
}
