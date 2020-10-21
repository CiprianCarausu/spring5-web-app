package com.cyKer.spring5webapp.model;

import java.util.Set;

public class Author {
    private String findName;
    private String lastName;
    private Set<Book> books;

    public Author(String findName, String lastName, Set<Book> books) {
        this.findName = findName;
        this.lastName = lastName;
        this.books = books;
    }

    public Author() {
    }

    public String getFindName() {
        return findName;
    }

    public void setFindName(String findName) {
        this.findName = findName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
