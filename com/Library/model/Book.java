
package com.LibraryFineSystem.model;

public class Book {

    private int bookId;
    private String bookName;

    public Book(int bookId, String bookName){
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public String getBookName(){
        return bookName;
    }

    public int getBookId(){
        return bookId;
    }
}
