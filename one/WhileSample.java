package com.java.one;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		String sn;

		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� q�� �Է��ϼ���.");
		
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
			System.out.println("�Էµ� ���� �����ϴ�.");
		
		else {	
			System.out.println("������ ������" + count + "���̸�");
			System.out.println("�����"+(double)sum/count + "�Դϴ�.");
		}
		sc.close();
	}
	
}