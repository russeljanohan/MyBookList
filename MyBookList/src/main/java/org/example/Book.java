package org.example;

class Book {
    private String title;
    private String author;
    private int yearPublished;
    private int currentPage;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.currentPage = 0; // start at page 0 by default
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", Current Page: " + currentPage);
    }

    public void changePage(int newPage) {
        if (newPage >= 0) {
            this.currentPage = newPage;
        }
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}