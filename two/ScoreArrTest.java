package com.java.two;

import java.util.Scanner;

public class ScoreArrTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int [] arr= {50,70,90,60,100};
		
		int sum=0;
		
//		System.out.println(arr.length + "개의 정수 입력");
		
//			for (int i = 0; i < arr.length; i++) {
//				arr[i]=scanner.nextInt();
//			}
			System.out.println("인원 : " +arr.length +"명");

			
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			System.out.println("총합 : " + sum + "점");
			System.out.println("평균 : " + (double)sum/arr.length + "점");
			
			
		
		
		//인원 : 5명
		//총합 : 
		//평균 : 
		//이내용이 출력 될 수 있도록하기
	}
}
