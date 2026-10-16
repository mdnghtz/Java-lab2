package lab1;

import java.util.Scanner;
import java.time.LocalDate;


public class book1{
    public static Book[] book;

    static {
        book = new Book[]{
                new Book("Sudovikov", "War and Peace", LocalDate.of(2026, 5, 15), LocalDate.of(2026, 6, 15)),
                new Book("Sandvik", "1984", LocalDate.of(2026, 9, 11), null),
                new Book("Ryjankov", "Fahrenheit 451", LocalDate.of(2026, 8, 26), LocalDate.of(2026, 9, 5)),
                new Book("Gorbunov", "The Master and Margarita", LocalDate.of(2026, 5, 22), LocalDate.of(2026, 6, 12))
        };
    }
    public static void fillBook() {
        System.out.println("Введите количество заказов");
        int n = (new Scanner(System.in)).nextInt();
        book = new Book[n];


        System.out.println("Введите информацию о заказах");
        for (int i = 0; i < book.length; i++) {
            System.out.println("Заказ" + (i + 1));
            book[i] = new Book();
        }
    }

    public static void printBook() {
        System.out.println("\nСписок заказов: ");
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i]);
        }
    }

    public static void minSearchTime() {
        long minDays = Long.MAX_VALUE;
        Book minBook = null;
        for (Book b : book) {
            if (b.getDatav() != null) {
                long days = java.time.temporal.ChronoUnit.DAYS.between(b.getDatez(), b.getDatav());
                if (days < minDays) {
                    minDays = days;
                    minBook = b;
                }
            }
        }

        if (minBook != null) {
            System.out.println("Самый маленький срок поиска: " + minDays + "дней");
            System.out.println(minBook);
        } else {
            System.out.println("Нет выданных книг");
        }
    }

    public static void countUnsatisfied() {
        int count = 0;
        for (Book book1 : book) {
            if (book1.getDatav() == null) {
                count++;
            }
        }
        System.out.println("Количество неудовлетвореных заказов: " + count);
    }


    public static void sortByNumberOfBooks() {
        for (int i = 0; i < book.length - 1; i++)
            for (int j = 0; j < book.length - i - 1; j++)
                if (countBooks(book[j].getSurname()) < countBooks(book[j + 1].getSurname())) {

                    Book rab = book[j];
                    book[j] = book[j + 1];
                    book[j + 1] = rab;
                }
        System.out.println("\nЧитатели по количеству заказаных книг: ");//
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].getSurname() + "-" + countBooks(book[i].getSurname()));
        }
    }








    private static int countBooks(String surname) {
        int count = 0;
        for (int i = 0; i < book.length; i++) {
            if (book[i].getSurname().equals(surname)) {
                count++;
            }
        }
        return count;
    }

    public static void sortByTitle() {
        for (int i = 0; i < book.length - 1; i++)
            for (int j = 0; j < book.length - i - 1; j++)
                if (book[j + 1].getBtitle().compareTo(book[i + 1].getBtitle()) > 0) {
                    Book rab = book[j];
                    book[j] = book[j + 1];
                    book[j + 1] = rab;
                }
        System.out.println("\nОтсортированный список по названиям: ");
        for (int i = 0; i < book.length; i++) {
            System.out.println("" + book[i]);
        }
    }
}
