package org.adbs.vtlabs.task14;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    protected Object clone() {
        return new Book(title, author, price);
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
}
