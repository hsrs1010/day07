package com.java.two;

import java.util.Scanner;

public class ScoreArrTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int [] arr= {50,70,90,60,100};
		
		int sum=0;
		
//		System.out.println(arr.length + "���� ���� �Է�");
		
//			for (int i = 0; i < arr.length; i++) {
//				arr[i]=scanner.nextInt();
//			}
			System.out.println("�ο� : " +arr.length +"��");

			
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			System.out.println("���� : " + sum + "��");
			System.out.println("��� : " + (double)sum/arr.length + "��");
			
			
		
		
		//�ο� : 5��
		//���� : 
		//��� : 
		//�̳����� ��� �� �� �ֵ����ϱ�
	}
}
