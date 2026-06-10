package practiceclass;

@SuppressWarnings("java:S106")

public class Shelve {

    public String myShelve;

    public Shelve(String myShelve) {

        this.myShelve = myShelve;

    }

    public void shelveName() {

        System.out.println("the name of the shelve is main shelve");

    }

    public class Book {

        public final String title;

        public Book(String title) {

            this.title = title;

        }

        public void bookShelve(Shelve firstShelve) {

            System.out.println("the book is in the first " + firstShelve.myShelve);

            System.out.println(myShelve);

        }

    }

    static class Room {

        public static String myRoom = "first room";

        public void getRoomName(Shelve shelve) {

            System.out.println("this room has a shelve named " + shelve.myShelve);

        }

    }

}