package com.study.ch08.bookManager;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectMenu = null;
        boolean loopFlag = true;

        Book[] books = new Book[3];
        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);


        while(loopFlag) {
            System.out.println("<<< 도서 관리 프로그램 >>>");
            System.out.println("1. 책 등록 2. 책 조회 q. 종료");
            System.out.println("메뉴 선택 >>> ");
            selectMenu = scanner.nextLine();
            if("q".equalsIgnoreCase(selectMenu)) {
                System.out.println("프로그램 종료 중...");
                loopFlag = false;
            } else if("1".equals(selectMenu)) {
                System.out.println("[책 등록 페이지] 입니다.");
                int emptyCount = 0;

                String bookNum = null;
                String title = null;
                String author = null;
                String publisher = null;

//                for(int i = 0; i < books.length; i++) {
//                    if(books[i] == null) {
//                        emptyCount++;
//                    }
//                }
//
//                if(emptyCount == 3) {
//                    System.out.println("더이상 등록할 수 없습니다.");
//                }

                if(bookService.isFull()) {
                    System.out.println("더이상 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("도서 번호 입력 >>> ");
                bookNum = scanner.nextLine();
                System.out.print("도서 제목 입력 >>> ");
                title = scanner.nextLine();
                System.out.print("저자명 입력 >>> ");
                author = scanner.nextLine();
                System.out.print("출판사 입력 >>> ");
                publisher = scanner.nextLine();

                Book book = new Book(bookNum, title, author, publisher);
                bookService.add(book);


//                for(int i = 0; i < books.length; i++) {
//                    if(books[i] == null) {
//                        books[i] = book;
//                        break;
//                    } else {
//                        System.out.println("더 이상 등록할 수 없습니다.");
//                    }
//                }


            } else if ("2".equals(selectMenu)) {
                System.out.println("[도서 조회 페이지] 입니다.");
                bookService.printBookList();

                } else {
                System.out.println("다시 입력하세요. >>> ");

            }

        }
        System.out.println("프로그램 종료 완료");
    }
}
