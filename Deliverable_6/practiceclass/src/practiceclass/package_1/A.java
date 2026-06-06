package practiceclass.package_1;

public class A {

    public String a; // public field a can be seen by other classess
    private int b; // this field is not visible to other classes except within is class
    boolean isMessage; // this is no modifier it can only be accessed within its package

    public A(String a) {

        this.a = a;
    }

    public A(int b) {

        this.b = b;

    }

    public A(boolean isMessage) {

        this.isMessage = isMessage;
    }


    
}
