package org.adbs.vtlabs.task15;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    @DisplayName("Task 15: Сортировка с помощью интерфейса Comparable - Ok")
    void testSortWithComparable() {
        Book book1 = new Book("title", "author", 10, 1);
        Book book2 = new Book("title", "author", 10, 2);
        Book book3 = new Book("title", "author", 10, 3);
        Book book4 = new Book("title", "author", 10, 4);
        List<Book> unsortedList = Arrays.asList(
                book2, book4, book3, book1
        );
        List<Book> expectedList = Arrays.asList(
                book1, book2, book3, book4
        );
        List<Book> actualList = unsortedList.stream().sorted().toList();
        assertEquals(expectedList, actualList);
    }
}