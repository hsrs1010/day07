package com.java.two;

import java.util.Scanner;

public class SwitchCalc {
	public static void main(String[] args) {
		//�μ��� �Է� �ް�, �����ڵ� �Է� ����
		//�Է� ���� �������� ��� ��� ���
		//if�����
		//switch, case �ٲٱ�
		
		Scanner sc=new Scanner(System.in);
		int num1=0;
		int num2=0;
		
		String oper="";
		
		//�Է� ���� ù��° ����, ������, �ι�° ����
		System.out.println("num1 �Է�");
		num1=sc.nextInt();
		
		System.out.println("������ �Է�(+,-,*,/)");
		oper=sc.next();
		
		System.out.println("num2 �Է�");
		num2=sc.nextInt();
		
		switch (oper) {
		case "+":
			System.out.println("+ : "+(num1+num2));
			break;
		case "-":
			System.out.println("- : "+(num1-num2));
			break;
		case "*":
			System.out.println("* : "+(num1*num2));
			break;
		case "/":
			System.out.println("/ : "+(float)(num1/num2));
			break;

		default:
			System.out.println("������ �߸� �Է�");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
//		if (oper.equals("+")) {
//			System.out.println("+ : "+(num1+num2));
//		}
//		else if (oper.equals("-")) {
//			System.out.println("- : "+(num1-num2));
//		}
//		else if (oper.equals("*")) {
//			System.out.println("* : "+(num1*num2));
//		}	
//		else if (oper.equals("/")) {
//			System.out.printf("/ : "+(float)(num1/num2));
//	
//		}
//		else { 
//			System.out.println("������ Ȯ��");
			sc.close();
		}
	}	