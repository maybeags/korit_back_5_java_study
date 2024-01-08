package com.study.ch08.bookManager;

public class BookService {
    final BookRepository bookRepository;

    BookService(BookRepository bookRepository) { this.bookRepository = bookRepository;}

    boolean isFull() {
        return bookRepository.getEmptyIndex() == -1;
    }

    void add(Book book) {bookRepository.insert(book);}

    void printBookList() {
        Book[] books = bookRepository.getBookDatas();
        if(books.length == 0) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }
        for(int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }
}
