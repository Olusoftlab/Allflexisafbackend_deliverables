package practiceclass.package_2;

import practiceclass.package_1.*;

public class B {

    public static void main(String[] args) {

        A a = new A("class A"); // Here is instance of class A with field a visible to all classess

        A b = new A(67); // here is instance of class a with private field b not visible to oter classes

        A c = new A(true);

        System.out.println(a.a); // we can access field a because is visible to all classes
        // System.out.println(b.b) field b cannot be accessed as it is declared private

        // System.out.println(c.isMessage); field isMessage cannot be accessed as is a
        // default field



        
    }

}
