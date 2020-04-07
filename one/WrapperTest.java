package com.java.one;

public class WrapperTest {
	public static void main(String[] args) {
		String num1="100";
		String num2="200";
		//두수를 더하기 (문자가 결합되버림)
//		System.out.println("더하기 : "+(num1+num2));
		
		//두수를 더하기
		//변환
		int cNum1=Integer.parseInt(num1);
		int cNum2=Integer.parseInt(num2);
		System.out.println("더하기 : "+(cNum1+cNum2));
	}
}
