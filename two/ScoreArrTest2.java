package com.java.two;

import java.util.Scanner;

public class ScoreArrTest2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[5];
		int sum = 0;

		System.out.println(arr.length + "���� ���� �Է�");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();

			if (arr[i] < 30 || arr[i]>100) {
				System.out.println("�Է°� ����");
				--i;
			}

		}
		System.out.println("�ο� : " + arr.length + "��");

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("���� : " + sum + "��");
		System.out.println("��� : " + (double) sum / arr.length + "��");

		// �ο� : 5��
		// ���� : 370��
		// ��� : 74��
		// �̳����� ��� �� �� �ֵ����ϱ�
		// �߰����� �ֿܼ��� ������ �Է� �޾Ƽ�
		// ���� �Է��� ���� : 30~100�� ����
		// �� ������ ó�� �� �� �ֵ��� �ϱ�
		scanner.close();
	}
}
