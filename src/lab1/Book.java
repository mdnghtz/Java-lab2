package lab1;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;


public class Book {
    private String surname;
    private String btitle;
    private LocalDate datez;
    private LocalDate datav;
    private static Book[] book;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");


    public Book(String surname, String btitle, LocalDate datez, LocalDate datav){
        this.setSurname(surname);
        this.setBtitle(btitle);
        this.setDatez(datez);
        this.setDatav(datav);
    }

    public String getSurname() {
        return this.surname;
    }

    public String getBtitle() {
        return this.btitle;
    }

    public LocalDate getDatez() {
        return this.datez;
    }

    public LocalDate getDatav() {
        return this.datav;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isEmpty())
            System.out.println("ошибка");
        else this.surname = surname;
    }

    public void setBtitle(String btitle) {
        if (btitle.isEmpty())
            System.out.println("ошибка");
        else this.btitle = btitle;
    }

    public void setDatez(LocalDate datez) {
        if (datez == null)
            System.out.println("ошибка");
        else this.datez = datez;
    }

    public void setDatav(LocalDate datav) {
        if (datav != null && datez != null && datav.isBefore(datez))
            System.out.println("ошибка");
        else this.datav = datav;
    }

    @Override
    public String toString() {
        return String.format("Фамилия - %s, Книга - %s, Дата заказа книги - %s, Дата выдачи книги - %s", this.surname, this.btitle, this.datez, this.datav);
    }

    public Book() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Surname: ");
        String title = sc.nextLine();

        System.out.println("Title: ");
        String capital = sc.nextLine();

        System.out.println("book order date: ");
        double square = sc.nextDouble();

        System.out.println("date of book issuance: ");
        int population = sc.nextInt();

        this.setSurname(surname);
        setBtitle(title);
        this.setDatez(datez);
        this.setDatav(datav);
    }
}


