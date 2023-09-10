package org.adbs.vtlabs.task13;

import org.adbs.vtlabs.task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = result * 53 + (Objects.nonNull(language) ? language.hashCode() : 0);
        result = result * 53 + level;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof ProgrammerBook that) {
            return super.equals(that)
                    && Objects.equals(this.language, that.language)
                    && Objects.equals(this.level, that.level);
        }
        return false;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n"
                + "title: " + getTitle() + "\n"
                + "author: " + getAuthor() + "\n"
                + "price: " + getPrice() + "\n"
                + "language: " + this.language + "\n"
                + "level: " + this.level + "\n"
                + "}";
    }
}
