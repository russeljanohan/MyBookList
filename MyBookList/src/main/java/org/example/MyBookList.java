package org.example;

public class MyBookList {
    public static void main(String[] args) {

        // 1. make 5 books using Book class
        //   (title, author, year)
        Book b1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        Book b2 = new Book("The Power of Habit", "Charles Duhigg", 2012);
        Book b3 = new Book("Atomic Habits", "James Clear", 2018);
        Book b4 = new Book("Java Programming", "John Doe", 2020);
        Book b5 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

        // 2. show all book details (starting pages all 0)
        System.out.println("\n--- Book List ---");
        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
        b4.displayDetails();
        b5.displayDetails();

        // 3. change pages for some books
        b1.changePage(50);  // rich dad poor dad now at page 50
        b3.changePage(100); // atomic habits now at 100
        System.out.println("\n--- Updated Pages ---");
        b1.displayDetails();
        b3.displayDetails();

        // 4. update my favorite book page
        b5.changePage(200);
        System.out.println("\n--- My Favorite Book Progress ---");
        b5.displayDetails();

        // 5. change author of Java Programming
        b4.setAuthor("Jane Smith");
        System.out.println("\n--- Updated Author ---");
        b4.displayDetails();

        // 6. store all books in an array then show those after 2010
        Book[] books = {b1, b2, b3, b4, b5};
        System.out.println("\n--- Books Published After 2010 ---");
        for (Book book : books) {
            if (book.getYearPublished() > 2010) {
                System.out.println("- "+book.getTitle());
            }
        }
    }
}