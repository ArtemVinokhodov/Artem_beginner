package book_task;

import java.util.ArrayList;

public class BookTester {

    public static void main(String[] args) {

        ArrayList<Book> booksWithSoftCover = new ArrayList<>();
        ArrayList<Book> booksWithHardCover = new ArrayList<>();

        ArrayList<Book> bookCollection = new ArrayList<>();
        bookCollection.add(new Book(22, "Kolobok", "soft", 200));
        bookCollection.add(new Book(11, "Kniga1", "hard", 12));
        bookCollection.add(new Book(55, "Kniga2", "soft", 55));
        bookCollection.add(new Book(33, "Kniga4", "hard", 123));
        bookCollection.add(new Book(44, "Kniga3", "soft", 222));
        bookCollection.add(new Book(66, "Kniga5", "hard", 121));

        for (Book x : bookCollection) {
            if (x.getCoverType().equals("soft")) {
                booksWithSoftCover.add(x);
            } else booksWithHardCover.add(x);
        }

        System.out.println("В магазине есть след книги с Мягким переплетом ");
        for (int i = 0; i < 1; i++) {
            System.out.println(booksWithSoftCover);
        }

        System.out.println("В магазине есть след книги с Твердым переплетом ");
        for (int i = 0; i < 1; i++) {
            System.out.println(booksWithHardCover);
        }
    }
}
