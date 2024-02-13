package abb.exercises;

import lombok.*;

import java.util.logging.Logger;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
public class Book {
    private static Logger LOG = Logger.getAnonymousLogger();
    private int id;
    private int name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return id == book.id && name == book.name;
    }

    @Override
    public int hashCode() {
        final int n = 31;
        int result = 1;
        result = result * n + this.id;
        result = result * n + this.name;
        return result;
    }

    public static void main(String[] args) {

        LOG.info("salamm");
        Logger global = Logger.getGlobal();
        global.info("salamm3");

        Book book = new Book(1, 15);
        Book book1 = new Book(1, 15);
        boolean equals = book.equals(book1);
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(equals);
        System.out.println();

    }

}
