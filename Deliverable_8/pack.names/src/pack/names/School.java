package pack.names;

@SuppressWarnings("java:S106")

public class School implements SchoolInfo {

    private String name;
    private String address;

    public School(String name, String address) {

        this.setName(name);
        this.setAddress(address);
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;

    }

    public String getAddress() {

        return this.address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    @Override

    public void printTotalStudents(int a, School h) {

        System.out.println("Total number of student in " + h.getName() + " is " + a);

    }

    @Override

    public void getRanking(int a, School h) {

        System.out.println(h.getName() + "is ranked " + a + (a == 2 ? "nd" : a == 3 ? "rd" : "th") + " in Nigeria");

    }

    @Override

    public void printAwards(String a, String b, String c, School h) {

        System.out.println(h.getName() + " has received " + a + ", " + b + ", " + c + " awards");

    }

}
