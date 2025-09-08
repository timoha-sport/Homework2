package Homework2;

public class DVD extends LibraryItem {
    private boolean checkOut;

    public DVD(String title, int year) {
        super(title, year);
    }

    public void checkOut() {
        if (getYear() >= 2000) {
            checkOut = true;
            System.out.printf("DVD %s checked out%n", getTitle());
        } else {
            System.out.println("It is forbidden to issue");
        }
    }

    public void returnItem() {
        checkOut = false;
        System.out.printf("Book %s is back%n", getTitle());
    }
}
