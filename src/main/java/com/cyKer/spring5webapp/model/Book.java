package com.cyKer.spring5webapp.model;

import java.util.Set;

public class Book {

    private String title;
    private String isBn;
    private Set<Author> authors;

    public Book(String title, String isBn, Set<Author> authors) {
        this.title = title;
        this.isBn = isBn;
        this.authors = authors;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsBn() {
        return isBn;
    }

    public void setIsBn(String isBn) {
        this.isBn = isBn;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
