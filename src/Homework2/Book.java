package Homework2;

public class Book extends LibraryItem {
    private boolean checkOut;

    public Book(String title, int year) {
        super(title, year);
    }

    public void checkOut() {
        checkOut = true;
        System.out.printf("Book %s checked out%n", getTitle());
    }

    public void returnItem() {
        checkOut = false;
        System.out.printf("Book %s is back%n", getTitle());
    }
}
