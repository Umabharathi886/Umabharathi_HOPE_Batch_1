package main;

import model.Book;
import model.Student;
import service.LibraryService;
import util.InputHelper;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter Student ID: ");
        int sid = InputHelper.scanner.nextInt();
        InputHelper.scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String sname = InputHelper.scanner.nextLine();

        System.out.print("Enter Book ID: ");
        int bid = InputHelper.scanner.nextInt();
        InputHelper.scanner.nextLine();

        System.out.print("Enter Book Name: ");
        String bname = InputHelper.scanner.nextLine();

        System.out.print("Enter Delay Days: ");
        int delay = InputHelper.scanner.nextInt();

        Student student = new Student(sid, sname);
        Book book = new Book(bid, bname);

        LibraryService library = new LibraryService();
        library.returnBook(student, book, delay);
    }
}
