package abb.exercises.exercise8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        library.addBook(new Book("Title", "Author", "Genre", 1990));
        library.addBook(new Book("Title1", "Author1", "Genre1", 1991));
        library.addBook(new Book("Title2", "Author2", "Genre2", 1992));
        library.addBook(new Book("Title3", "Author3", "Genre3", 1993));
        library.addBook(new Book("Title4", "Author4", "Genre4", 1994));
        library.addBook(new Book("Title5", "Author5", "Genre5", 1995));
        library.addBook(new Book("Title6", "Author6", "Genre6", 1996));
        library.addBook(new Book("Title7", "Author7", "Genre7", 1997));
        library.addBook(new Book("Title8", "Author8", "Genre8", 1998));
        library.addBook(new Book("Title9", "Author9", "Genre9", 1999));
        library.addBook(new Book("Title10", "Author10", "Genre10", 2000));


        System.out.println("Books sorted by title:");
        library.getAllBooksSortedByTitle().forEach(System.out::println);
        System.out.println("==============================================");

        System.out.println("Books sorted by author:");
        library.getAllBooksSortedByAuthor().forEach(System.out::println);
        System.out.println("========================================================");

        System.out.println("Books sorted by publicationYear:");
        library.getAllBooksSortedByPublicationYear().forEach(System.out::println);
        System.out.println("==============================================");

        System.out.println("Books with title");
        library.searchByTitle("Title3").forEach(System.out::println);
        System.out.println("========================================================");

        System.out.println("Remove book");
        library.removeBook(library.getBooks().get(5));
        System.out.println("========================================================");


        System.out.println("Average publicationYear: " + library.getAveragePublicationYear());
        System.out.println("========================================================");
        System.out.println("Count of books in the library: " + library.countBooks());

        System.out.print("Enter deleted genre : ");
        String genre = sc.nextLine();
        System.out.println(library.searchByGenre(genre));
        System.out.println("==================");

        System.out.print("Enter author  name : ");
        String author = sc.nextLine();
        System.out.println(library.searchByAuthor(author));
        System.out.println("======================");

    }
}
