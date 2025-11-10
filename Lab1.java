class Book {
    String title;
    String author;
    double price;

       Book(String title, String author, double price) {
        this.title = title;   // 'this' refers to the current object's title
        this.author = author; // 'this' refers to the current object's author
        this.price = price;   // 'this' refers to the current object's price
    }

      void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: ₹" + this.price);
        System.out.println("--------------------");
    }
}


public class Lab1 {
    public static void main(String[] args) {
        // Creating book objects
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 499.99);
        Book b2 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 350.00);

        // Printing details using method
        b1.displayDetails();
        b2.displayDetails();
    }
}