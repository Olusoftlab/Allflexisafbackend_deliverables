package practiceclass.package_1;

public class D {

    protected int a;

    public D(int a) {

        this.a = a;
    }

    public static void main(String[] args) {

        A c = new A(false);

        System.out.println(c.isMessage); // c can be ccessed by class D as default field because they belong to same
                                         // package

    }

}
