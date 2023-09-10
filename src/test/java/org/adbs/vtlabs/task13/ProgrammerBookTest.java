package org.adbs.vtlabs.task13;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammerBookTest {
    @Test
    @DisplayName("Task 13: Проверка методов equals, hashCode")
    void equalsAndHashcode() {
        ProgrammerBook book1 = new ProgrammerBook("title1", "author1", 10, "english", 1);
        ProgrammerBook book2 = new ProgrammerBook("title2", "author1", 10, "english", 1);
        ProgrammerBook book3 = new ProgrammerBook("title1", "author1", 10, "english", 1);
        ProgrammerBook book4 = new ProgrammerBook("title1", "author1", 10, "russian", 1);

        assertNotEquals(book1, book2);
        assertEquals(book1, book3);
        assertNotEquals(book2, book3);
        assertNotEquals(book1, book4);

        assertNotEquals(book1.hashCode(), book2.hashCode());
        assertEquals(book1.hashCode(), book3.hashCode());
        assertNotEquals(book2.hashCode(), book3.hashCode());
        assertNotEquals(book1.hashCode(), book4.hashCode());
    }

    @Test
    void viewToString() {
        ProgrammerBook book1 = new ProgrammerBook("title1", "author1", 10, "english", 1);
        System.out.println(book1);
    }
}