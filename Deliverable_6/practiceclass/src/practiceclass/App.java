package practiceclass;

@SuppressWarnings("java:S106")

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("practicing classes, methods, anonymous methods and lambda");
        System.out.println("somebody");
        System.out.println(2 + 4);

        Shelve newShelve = new Shelve("shelve");

        Shelve.Book book1 = newShelve.new Book("cinderrella");

        book1.bookShelve(newShelve);

        Shelve.Room getRoom = new Shelve.Room();

        System.out.println(Shelve.Room.myRoom);

        getRoom.getRoomName(newShelve);

        // local xlasses example

        LocalClass completeName = new LocalClass();

        completeName.getFullName("Olumide", "Adebayo");

        // Anonymous class example

        AnonymousClass defineAnonymous = new AnonymousClass();

        defineAnonymous.anonyExample();

    }

}
