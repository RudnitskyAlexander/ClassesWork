package Lessons.Lesson_30_collection;
//https://javarush.ru/groups/posts/2354-arraylist-v-java
//������� 1
//        ������������ ������ � ���������� ����� �����. ���������� ����� ���������� ��������� � ������. �����
//        ���� ����� �������� ����, � ������� ���������� ������������ ����� �������:
//        1. �������� ������� � ������.
//        2. ������� ������� �� ������.
//        3. �������� ���������� ������.
//        4. ��������� ���� �� �������� � ������.
//        5. �������� �������� � ������.
//        � ����������� �� ������ ������������ �����������
//        ��������, ����� ���� ���� ������������ �����

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("ASD");
		lst.add("jkl");
		lst.add("kli");
		lst.add("PiU");
		lst.add("2p3");

		Scanner in = new Scanner(System.in);
		int choice;
		while (true) {
			printMenu();
			choice = in.nextInt();
			switch (choice) {
				case 1:
					addElem(lst);
					break;
				case 2:
					dellElem(lst);
					break;
				case 3:
					printArr(lst);
					break;
				case 4:
					isContain(lst);
					break;
				case 5:
					changeElem(lst);
					break;
				case 9:
					return;
				default:
					System.out.println("�������� ����� ����.");
			}
		}
	}

	static void printMenu() {
		System.out.println("**********************************");
		System.out.println("1. �������� ������� � ������.");
		System.out.println("2. ������� ������� �� ������.");
		System.out.println("3. �������� ���������� ������.");
		System.out.println("4. ��������� ���� �� �������� � ������.");
		System.out.println("5. �������� �������� � ������.");
		System.out.println("9. �����.");
		System.out.println("**********************************");
		System.out.print("�������� ����� ��������: ");
	}

	static void addElem(List<String> flst) {
		Scanner in = new Scanner(System.in);
		System.out.print("������� ����� �������: ");
		String newElem = in.nextLine();
		System.out.println("������� �������� � �������? ������  1: ");
		System.out.println("������� �������� � �����? ������  0: ");
		int choice = in.nextInt();
		if (choice == 1) {
			System.out.println("������� ������ �������: ");
			int index = in.nextInt();
			if (index > 0 && index <= flst.size()) {
				flst.add(index, newElem);
			} else {
				System.out.println("������ �������� ������.");
			}
		} else flst.add(newElem);
		printArr(flst);
	}

	static void dellElem(List<String> flst) {// TODO: 11.11.2022 �������  �������� �������� ��� �������� �������
		printArr(flst);
		Scanner in = new Scanner(System.in);
		System.out.print("������� ������ ���������� ��������: ");
		int index = in.nextInt();
		if (index >= 0 && index < flst.size()) {
			flst.remove(index);
		} else {
			System.out.println("�� ����� �������� ������ ��������.");
		}
		printArr(flst);
	}

	static void printArr(List<String> flst) {
		System.out.println("============================");
		//	System.out.println(flst.toString());
		for (int i = 0; i < flst.size(); i++) {
			System.out.print(" [" + i + ":" + " " + flst.get(i) + "]");
		}
		System.out.println("\n============================");
	}

	static void isContain(List<String> flst) {
		Scanner in = new Scanner(System.in);
		System.out.print("������� ������� ��� ��������: ");
		String newElem = in.nextLine();
		if (flst.contains(newElem) == true) {
			System.out.println("������� \"" + newElem + "\" ���������� �� �������: " + flst.indexOf(newElem));
		} else {
			System.out.println("������� \"" + newElem + "\" � ������ �� ����������.");
			printArr(flst);
		}
	}

	static void changeElem(List<String> flst) {// TODO: 11.11.2022 ������� ������ ����������� �������� ��� �������� �������
		// TODO: 11.11.2022 �������� ����� ������� �� ��������� ���������� ��������
		Scanner in = new Scanner(System.in);
		printArr(flst);
		System.out.print("������� ������ �������� ��� ������: ");
		int index = in.nextInt();
		if (index >= 0 && index < flst.size()) {
			System.out.print("������� ����� ���������� ��������: ");
			String newElem = in.nextLine();
			newElem = in.nextLine();
			flst.add(index, newElem);
			flst.remove(index + 1);
			System.out.println("\n============================");
			System.out.println("������� [" + index + "] ��� ������� �� ����� ������� \"" + newElem + " \"");
		} else {
			System.out.println("�� ����� �������� ������ ��������.");
		}
		printArr(flst);
	}


}
