package practiceclass;
@SuppressWarnings("java:S106")

public class Book {

     public String bookLetter;

     public Book(String bookLetter){

         this.bookLetter=bookLetter;
     }


    public void getBoldLetterBook(Book book, BoldLetter bold){


             if (bold.boldLetter(book)){
              
                System.out.println("the book has bold letters"); 
                
             }else{

                System.out.println("The book does not have bold letters");
             }


    }



}