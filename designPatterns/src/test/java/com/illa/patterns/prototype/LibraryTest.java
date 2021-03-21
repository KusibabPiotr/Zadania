package com.illa.patterns.prototype;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

//    @Test
//    public void testGetBooks(){
//        //given
//        Book book1 = new Book("Ogniem i krukiem", "Antionio", LocalDate.of(1987, 11, 14));
//        Book book = new Book("Witcher", "Pablito", LocalDate.of(2001, 11, 10));
//        Book book2 = new Book("Sinister", "Gavorro", LocalDate.of(2011, 3, 21));
//        Library library = new Library("New delivery");
//        library.getBooks().add(book);
//        library.getBooks().add(book1);
//        library.getBooks().add(book2);
//        //when
//        Set<Book> books = library.getBooks();
//        //then
//        assertThat(books).hasSize(3);
//        assertThat(books).containsOnly(book,book1,book2);
//    }

@Test
public void testGetBooksFromLibraryClone(){
    //given
    Book book1 = new Book("Ogniem i krukiem", "Antionio", LocalDate.of(1987, 11, 14));
    Book book = new Book("Witcher", "Pablito", LocalDate.of(2001, 11, 10));
    Book book2 = new Book("Sinister", "Gavorro", LocalDate.of(2011, 3, 21));
    Library library = new Library("First delivery");
    library.getBooks().add(book);
    library.getBooks().add(book1);
    library.getBooks().add(book2);
    //when
    Set<Book> books = library.getBooks();
    Library copyLibrary = null;
    try {
        copyLibrary = library.deepCopy();
        copyLibrary.setName("Copied Delivery");
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }
    Set<Book> copyBooks = copyLibrary.getBooks();
    //then
    System.out.println(">>>>");
    copyBooks.forEach(System.out::println);
    System.out.println(">>>>");
    books.forEach(System.out::println);
    assertThat(books).hasSize(3);
    assertThat(copyLibrary.getBooks()).hasSize(3);
    assertThat(books).containsOnly(book,book1,book2);
    assertThat(copyBooks).containsOnly(book,book1,book2);
    assertThat(copyBooks).isEqualTo(books);
}
}