package org.example;

import java.util.Objects;

public class Book {
    private String book_name;
    private String author;

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(book_name, book.book_name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book_name, author);
    }
}
