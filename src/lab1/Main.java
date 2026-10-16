package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        cycle: while (true){
            System.out.println("1. Заполнить массив");
            System.out.println("2. Распечатать");
            System.out.println("3. Самый маленький срок доставки");
            System.out.println("4. Сколько заказов не было удовлетворено");
            System.out.println("5. Упорядочить читателей по количеству заказанных книг");
            System.out.println("6. Упорядочить книги по названиям");
            System.out.println("7. Выход");
            System.out.println("Выберите пункт меню (1...7)");
            int c = (new Scanner(System.in)).nextInt();
            switch(c) {
                case 1: BookService.fillBook(); break;
                case 2: BookService.printBook(); break;
                case 3: BookService.minSearchTime(); break;
                case 4: BookService.countUnsatisfied(); break;
                case 5: BookService.sortByNumberOfBooks(); break;
                case 6: BookService.sortByTitle(); break;
                default: break cycle;
            }


        }
    }
}
