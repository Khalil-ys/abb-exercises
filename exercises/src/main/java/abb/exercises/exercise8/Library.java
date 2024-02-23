package abb.exercises.exercise8;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor
public class Library {

    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> searchByTitle(String title) {
        return books.stream()
                .filter(x -> x.getTitle().equalsIgnoreCase(title))
                .toList();
    }

    public List<Book> searchByAuthor(String author) {
        List<String> allAuthor = getAllAuthor();
        if (allAuthor.contains(author.toLowerCase())){
            return books.stream().filter(x->x.getAuthor().equalsIgnoreCase(author)).toList();
        }else {
            System.out.println("Bu muellifin kitabi tapilmadi ! ");
            return Collections.emptyList();
        }
    }

    public List<String> getAllAuthor() {
        return books.stream()
                .flatMap(x -> x.getAuthor()
                        .toLowerCase()
                        .lines()).toList();
    }

    public List<Book> searchByGenre(String genre) {
        List<String> allGenres = getAllGenres();
        if (allGenres.contains(genre.toLowerCase())) {
            return books.stream()
                    .filter(x -> x.getGenre().equalsIgnoreCase(genre))
                    .toList();
        } else {
            System.out.println("Bu janrda kitab tapilmadi ! ");
            return Collections.emptyList();
        }
    }

    public List<String> getAllGenres() {
        return books.stream()
                .flatMap(x -> x.getGenre()
                        .toLowerCase()
                        .lines()).toList();
    }


    public List<Book> getAllBooksSortedByTitle() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .toList();
    }

    public List<Book> getAllBooksSortedByAuthor() {
        return books.stream()
                .sorted(Comparator.comparing(Book::getAuthor))
                .toList();
    }

    public List<Book> getAllBooksSortedByPublicationYear() {
        return books.stream()
                .sorted(Comparator.comparingInt(Book::getPublicationYear))
                .toList();
    }

    public double getAveragePublicationYear() {
        Integer publicationYear = 0;
        for (Book book : books) {
            publicationYear += book.getPublicationYear();
        }
        return (double) publicationYear / books.size();
    }

    public double getAveragePublicationYear1() {
        OptionalDouble average = books.stream()
                .mapToInt(Book::getPublicationYear)
                .average();
        return average.orElse(0.0);
    }

    public double getAveragePublicationYear2() {
        OptionalDouble average = books.stream()
                .mapToInt(Book::getPublicationYear)
                .average();
        return average.isPresent() ? average.getAsDouble() : 0.0;
    }

    public int countBooks() {
        return books.size();
    }


}
