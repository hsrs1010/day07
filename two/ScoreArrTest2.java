package com.java.two;

import java.util.Scanner;

public class ScoreArrTest2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[5];
		int sum = 0;

		System.out.println(arr.length + "개의 정수 입력");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();

			if (arr[i] < 30 || arr[i]>100) {
				System.out.println("입력값 제외");
				--i;
			}

		}
		System.out.println("인원 : " + arr.length + "명");

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("총합 : " + sum + "점");
		System.out.println("평균 : " + (double) sum / arr.length + "점");

		// 인원 : 5명
		// 총합 : 370점
		// 평균 : 74점
		// 이내용이 출력 될 수 있도록하기
		// 추가내용 콘솔에서 점수를 입력 받아서
		// 점수 입력의 제한 : 30~100점 사이
		// 위 내용이 처리 될 수 있도록 하기
		scanner.close();
	}
}
