package com.study.ch08.bookManager;

public class Book {
    String bookNum;
    String title;
    String author;
    String publisher;

    public Book(String bookNum, String title, String author, String publisher) {
        this.bookNum = bookNum;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNum='" + bookNum + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
