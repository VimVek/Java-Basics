package associationAggregationComposition;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        // Association Code Starts
        System.out.println("Association Code Starts");
        System.out.println();

        BankAs bank = new BankAs("SBI");

        EmployeeAs emp1 = new EmployeeAs("Vivek");
        EmployeeAs emp2 = new EmployeeAs("Kush");

        Set<EmployeeAs> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);

        bank.setEmployees(employees);

        System.out.println(emp1.getEmployeeName() + " Belongs to: " + bank.geBankName());
        System.out.println(employees);

        System.out.println();
        System.out.println("Association Code Ends");
        System.out.println("\n");
        // Association Code Ends

        // Aggregation Code Starts
        System.out.println("Aggregation Code Starts");
        System.out.println();

        StudentAg s1 = new StudentAg("Vivek", 001, "CSE");
        StudentAg s2 = new StudentAg("Kush", 002, "IT");
        StudentAg s3 = new StudentAg("Savi", 003, "IT");
        StudentAg s4 = new StudentAg("Abhishek", 004, "CSE");

        List<StudentAg> cseStudents = new ArrayList<>();
        cseStudents.add(s1);
        cseStudents.add(s4);

        List<StudentAg> itStudents = new ArrayList<>();
        itStudents.add(s2);
        itStudents.add(s3);

        DepartmentAg cse = new DepartmentAg("CSE", cseStudents);
        DepartmentAg it = new DepartmentAg("IT", itStudents);

        List<DepartmentAg> departments = new ArrayList<>();
        departments.add(cse);
        departments.add(it);

        InstituteAg institute = new InstituteAg("NIET", departments);

        System.out.println("Total number of Students in NIET is: " + institute.getTotalStudentsInInstitute());
        System.out.println();
        System.out.println("Aggregation Code Ends");
        System.out.println("\n");
        // Aggregation Code Ends

        // Coposition Code Starts
        System.out.println("Coposition Code Starts");
        System.out.println();
        BookC book1 = new BookC("How to Become Smart", "Kush Kumar Sharma");
        BookC book2 = new BookC("How to be Pro in Gaming", "Vivek Joshi");
        BookC book3 = new BookC("How to Cook", "Savi Joshi");
        BookC book4 = new BookC("How to be Rich", "Abhishek Tyagi");

        List<BookC> allBooks = new ArrayList<>();
        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);

        LibraryC library = new LibraryC(allBooks);
        List<BookC> books = library.getTotalBooksInLibrary();

        for (BookC bks: books){
            System.out.println("Title: " + bks.title + " BY Author: " + bks.author);
        }
        System.out.println();
        System.out.println("Coposition Code Ends");
        // Coposition Code Ends
    }
}
