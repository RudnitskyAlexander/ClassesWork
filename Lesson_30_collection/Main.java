package Lessons.Lesson_30_collection;
//https://javarush.ru/groups/posts/2354-arraylist-v-java
//Задание 1
//        Пользователь вводит с клавиатуры набор чисел. Полученные числа необходимо сохранить в список. После
//        чего нужно показать меню, в котором предложить пользователю набор пунктов:
//        1. Добавить элемент в список.
//        2. Удалить элемент из списка.
//        3. Показать содержимое списка.
//        4. Проверить есть ли значение в списке.
//        5. Заменить значение в списке.
//        В зависимости от выбора пользователя выполняется
//        действие, после чего меню отображается снова

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
					System.out.println("Неверный номер меню.");
			}
		}
	}

	static void printMenu() {
		System.out.println("**********************************");
		System.out.println("1. Добавить элемент в список.");
		System.out.println("2. Удалить элемент из списка.");
		System.out.println("3. Показать содержимое списка.");
		System.out.println("4. Проверить есть ли значение в списке.");
		System.out.println("5. Заменить значение в списке.");
		System.out.println("9. Выход.");
		System.out.println("**********************************");
		System.out.print("Выберете номер операции: ");
	}

	static void addElem(List<String> flst) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите новый элемент: ");
		String newElem = in.nextLine();
		System.out.println("Элемент вставить в позицию? выбери  1: ");
		System.out.println("Элемент вставить в конец? выбери  0: ");
		int choice = in.nextInt();
		if (choice == 1) {
			System.out.println("Введите индекс позиции: ");
			int index = in.nextInt();
			if (index > 0 && index <= flst.size()) {
				flst.add(index, newElem);
			} else {
				System.out.println("Введен неверный индекс.");
			}
		} else flst.add(newElem);
		printArr(flst);
	}

	static void dellElem(List<String> flst) {// TODO: 11.11.2022 вариант  удаления элемента без указания индекса
		printArr(flst);
		Scanner in = new Scanner(System.in);
		System.out.print("Введите индекс удаляемого элемента: ");
		int index = in.nextInt();
		if (index >= 0 && index < flst.size()) {
			flst.remove(index);
		} else {
			System.out.println("Вы ввели неверный индекс элемента.");
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
		System.out.print("Введите элемент для проверки: ");
		String newElem = in.nextLine();
		if (flst.contains(newElem) == true) {
			System.out.println("Элемент \"" + newElem + "\" расположен на позиции: " + flst.indexOf(newElem));
		} else {
			System.out.println("Элемент \"" + newElem + "\" в списке не содержится.");
			printArr(flst);
		}
	}

	static void changeElem(List<String> flst) {// TODO: 11.11.2022 вариант замены конкретного элемента без указания индекса
		// TODO: 11.11.2022 проверка всего массива на повторное содержание элемента
		Scanner in = new Scanner(System.in);
		printArr(flst);
		System.out.print("Введите индекс элемента для замены: ");
		int index = in.nextInt();
		if (index >= 0 && index < flst.size()) {
			System.out.print("Введите новое содержание элемента: ");
			String newElem = in.nextLine();
			newElem = in.nextLine();
			flst.add(index, newElem);
			flst.remove(index + 1);
			System.out.println("\n============================");
			System.out.println("Элемент [" + index + "] был заменен на новый элемент \"" + newElem + " \"");
		} else {
			System.out.println("Вы ввели неверный индекс элемента.");
		}
		printArr(flst);
	}


}
