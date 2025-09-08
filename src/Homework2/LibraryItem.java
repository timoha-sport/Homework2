package Homework2;

public abstract class LibraryItem {
    private String title;
    private int year;

    public LibraryItem(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public abstract void checkOut();

    public abstract void returnItem();

    public void printDetails() {
        System.out.println(title + " - " + year + "г.");
    }

    public static void main(String[] args) {
        Book bk = new Book("Война и мир", 1869);
        bk.checkOut();
        bk.returnItem();
        bk.printDetails();

        DVD dv = new DVD("Война и мир", 1869);
        dv.checkOut();
        dv.returnItem();
        dv.printDetails();
    }
}
