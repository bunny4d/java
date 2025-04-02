class book{
    public String title;
    public String author;
    public int yearofpublication;
    
    book(String title, String author, int yearofpublication) {
        this.title = title;
        this.author = author;
        this.yearofpublication = yearofpublication;
        }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + yearofpublication);
        }
}

public class q1{
    public static void main(String[] args) {
        book book1 = new book("Harry Potter", "J.K. Rowling", 1997);
        book book2 = new book("verity", "coleen hoower",2017);
        book1.display();
        book2.display();
    }
}




