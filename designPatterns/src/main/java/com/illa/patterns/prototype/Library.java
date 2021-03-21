package com.illa.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library implements Cloneable {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library copy = shallowCopy();
        copy.books = new HashSet<>();
        for (Book book : books) {
            copy.getBooks().add(book);
        }
        return copy;
    }
}
