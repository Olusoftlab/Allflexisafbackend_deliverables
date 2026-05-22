package bookprogram;

import java.util.ArrayList;

@SuppressWarnings("java:S106")

public class Book implements Collection {

     public String title;
     public String author;
     public int _isbn;

     private static ArrayList<Book> collection = new ArrayList<>();

     public Book(String title, String author, int _isbn) {

          this.title = title;
          this.author = author;
          this._isbn = _isbn;
     }

     @Override

     public String toString() {

          return "{" + "Title: " + title + ", " + "Author:" + author + ", " + "ISBN: " + _isbn + "}";

     }

     @Override

     public void addBookToCollection(Book x) {

         if (!collection.contains(x)){
             
             collection.add(x);
             System.out.println(collection); 
              
         }else{

             System.out.println(collection);  
         }


     }

     @Override

     public void removeBookFromCollection(Book y) {

           if (collection.contains(y)){
                
               collection.remove(y);
               System.out.println(collection);

           }else{
 
                System.out.println(collection);

           }


     }

}