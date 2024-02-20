package abb.exercises.exercise8;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String title;
    private String author;
    private String genre;
    private Integer publicationYear;

}
