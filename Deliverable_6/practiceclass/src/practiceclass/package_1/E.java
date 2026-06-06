package practiceclass.package_1;

public class E extends D {

    public E(int s) {

        super(s);
    }

    public static void main(String[] args) {

        D d = new D(78);

        System.out.println(d.a); // field a is accessible to the class E because is a protected field meaning
                                 // subclass can have access to the field

    }

}
