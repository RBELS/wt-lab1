package org.adbs.vtlabs.task14;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    @DisplayName("Task 14: Вызов метода clone - ok")
    void testClone() {
        Book book = new Book("title", "author", 10);
        Book clonedBook = (Book) book.clone();

        assertEquals(book, clonedBook);
        assertNotSame(book, clonedBook);
    }
}