package pack.names;

@SuppressWarnings("java:S106")

public class Student extends Distinction implements StudentInfo {

    private int age;
    private char grade;
    private String name;

    public Student(int age, char grade, String name) {

        this.setAge(age);
        this.setGrade(grade);
        this.setName(name);

    }

    public int getAge() {

        return this.age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public char getGrade() {

        return this.grade;
    }

    public void setGrade(char grade) {

        this.grade = grade;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override

    public void verifyDistinction(char a, Student s) {

        if (s.getGrade() == a) {

            System.out.println("Student is on distinction");

        } else {

            System.out.println("Student not on distinction");
        }

    }

    @Override

    public void gradeClass(Student s) {

        char result = s.getGrade();

        switch (result) {

            case 'A':
                System.out.println("first class");
                break;

            case 'B':
                System.out.println("Second class upper");
                break;

            case 'C':
                System.out.println("Second class lower");
                break;

            default:
                System.out.println("No class awarded");

        }

    }

    @Override

    public int averageHeight(int a) {

        System.out.println("the student average height is " + a + "inches tall");

        return a;

    }

    @Override

    public void getComplexion(String s) {

        System.out.println("the student is " + s + " in complexion");

    }

}