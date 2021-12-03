package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book firstBook = new Book("War and peace", 587);
        Book secondBook = new Book("Clean code", 867);
        Book thirdBook = new Book("Fairytale", 124);
        Book fourthBook = new Book("Economy for dummies", 52);
        Book[] booksArray = new Book[4];
        booksArray[0] = firstBook;
        booksArray[1] = secondBook;
        booksArray[2] = thirdBook;
        booksArray[3] = fourthBook;
        for (Book book : booksArray) {
            System.out.println("Book name is: " + book.getName() + ", its page count is: " + book.getPageCount());
        }
        System.out.println("Rotating first and fourth book");
        Book tempBook = booksArray[0];
        booksArray[0] = booksArray[3];
        booksArray[3] = tempBook;
        for (Book book : booksArray) {
            System.out.println("Book name is: " + book.getName() + ", its page count is: " + book.getPageCount());
        }
        System.out.println("Showing only books which name is \"Clean code\"");
        for (Book book : booksArray) {
            if ("Clean code".equals(book.getName())) {
                System.out.println("Book name is: " + book.getName() + ", its page count is: " + book.getPageCount());
            }
        }
    }
}
