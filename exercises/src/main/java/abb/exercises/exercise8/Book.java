package abb.exercises.exercise8;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private String genre;
    private Integer publicationYear;

    @Override
    public int compareTo(Book o) {
        return o.publicationYear;
    }
}
