package org.adbs.vtlabs.task15;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        int result = Objects.nonNull(title) ? title.hashCode() : 0;
        result = result * 53 + (Objects.nonNull(author) ? author.hashCode() : 0);
        result = result * 53 + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof Book that) {
            return Objects.equals(this.title, that.title)
                    && Objects.equals(this.author, that.author)
                    && Objects.equals(this.price, that.price);
        }
        return false;
    }

    @Override
    public int compareTo(Book o) {
        return this.isbn - o.isbn;
    }
}
