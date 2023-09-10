package org.adbs.vtlabs.task12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    @DisplayName("Task 12: Проверка методов equals, hashCode")
    void equalsAndHashcode() {
        Book book1 = new Book("title1", "author1", 10);
        Book book2 = new Book("title2", "author2", 20);
        Book book3 = new Book("title1", "author1", 10);

        assertNotEquals(book1, book2);
        assertEquals(book1, book3);
        assertNotEquals(book2, book3);

        assertNotEquals(book1.hashCode(), book2.hashCode());
        assertEquals(book1.hashCode(), book3.hashCode());
        assertNotEquals(book2.hashCode(), book3.hashCode());
    }

    @Test
    void viewToString() {
        Book book1 = new Book("title1", "author1", 10);
        System.out.println(book1);
    }
}