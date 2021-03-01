package kg.megacom;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>(5);
        bookList.add("The White Ship");
        bookList.add("The Day Lasts More Than a Hundred Years");
        bookList.add("Mother Earth and Other Stories");
        bookList.add("Jamila");
        bookList.add("Mother Earth");
        System.out.println("________The list of Chingiz Aitmatov books");
        for (String books : bookList) {
            System.out.println(books);
        }
        bookList.remove(4);
        System.out.println("________Removed last book from the list");
        bookList.forEach(System.out::println);
        System.out.println("________Replaced last book with deleted");
        bookList.set(3, "Mother Earth");
        bookList.forEach(System.out::println);
        System.out.println("________Printed out only the last book");
        String book = bookList.get(3);
        System.out.println(book);
        ArrayList<String> newBookList = new ArrayList<>(3);
        System.out.println("________Added 3 books to the list ");
        newBookList.add("Effective Java");
        newBookList.add("Learn Java in 1 Day: Complete Beginners Guide");
        newBookList.add("Java Deep Learning Projects");
        bookList.addAll(newBookList);
        bookList.forEach(System.out::println);
        System.out.println("________Cleared book list");
        bookList.clear();
        System.out.println(bookList);
    }
}
