import java.util.*;
class Book{
    private String title,author;
    private int id;
    private boolean availability;
    Book(String title,String author,int id){
        this.title = title;
        this.author = author;
        this.id = id;
        this.availability = true;
    }
    boolean isAvailable(){
        return availability;
    }
    String getTitle(){
        return title;

    }
    String getAuthor(){
        return author;
    }
    int getId(){
        return id;
    }
    void setAvailability(boolean status){
        availability = status;
    }
    
    void display(){
        System.out.println(title + " | " + author + " | " + id + " | " +  (availability ? "Available" : "Issued"));
    }
}
class Library{
    ArrayList<Book> books = new ArrayList<>();
     void addBook(Book b){
        books.add(b);
        System.out.println(b.getTitle() + " Added to library.");
     }
     void issueBook(int  id){
        for(Book b : books){
            if(b.getId() == id){
                if(b.isAvailable()){
                    b.setAvailability(false);
                    System.out.println("Book issued: " + b.getTitle());
                }else{
                        System.out.println("Boook already issued.");
                }
                return;
            }
            }
            
            System.out.println("Book not found");   
        }
        void acceptBook(int id){
        for (Book b : books){
            if(b.getId()==id){
                if(!b.isAvailable()){
                    b.setAvailability(true);
                    System.out.println("Book returned: " + b.getTitle());
                }else{
                    System.out.println("Book: " + b.getTitle() + " not issued to the user.");
                }
                return;
            }
        }
         System.out.println("Book not found"); 

     }
     void display(){
        System.out.println("\n --Library Books---");
        for(Book b : books){
            b.display();
        }
    }
 }
class User{
    String user_name;
    private int userId;
    User(String User_name,int userId){
        this.user_name = User_name;
        this.userId = userId;
    }

    void borrowBook(Library lib,int bookId){
        System.out.println("User:  "+ userId +" borrowing the book.");
        lib.issueBook(bookId);
    }
    void returnBook(Library lib,int bookId){
        System.out.println("User: " + userId + " returning book.");
        lib.acceptBook(bookId);
    }
}
class Main{
    public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book("Netflix","ABC",001);
        Book b2 = new Book("Amazon","BCA",002);
        lib.addBook(b1);
        lib.addBook(b2);
        User u1 = new User("AAA",001);
        User u2 = new User("BBB",002);
        u1.borrowBook(lib,001);
        u1.returnBook(lib,002);
        lib.display();

    }
}