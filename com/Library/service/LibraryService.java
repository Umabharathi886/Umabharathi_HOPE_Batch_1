

import com.LibraryFineSystem.model.Book;
import com.LibraryFineSystem.model.Student;

public class LibraryService {

    public void returnBook(Student student, Book book, int delayDays){

        FineCalculator fc = new FineCalculator();

        int fine = fc.calculateFine(delayDays);

        System.out.println("Student: " + student.getStudentName());
        System.out.println("Book: " + book.getBookName());
        System.out.println("Delay Days: " + delayDays);
        System.out.println("Fine: ₹" + fine);
    }
}
