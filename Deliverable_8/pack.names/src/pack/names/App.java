package pack.names;

@SuppressWarnings("java:S106")

public class App {
    public static void main(String[] args) {

        Student olumild = new Student(33, 'A', "olumide");

        olumild.gradeClass(olumild);
        olumild.verifyDistinction('A', olumild);
        olumild.averageHeight(6);
        olumild.getComplexion("dark");

        School A = new School("St francis", "No 27 Ajose Street Mende Maryland");

        System.out.println(A.getName());
        System.out.println(A.getAddress());

        A.printTotalStudents(500, A);
        A.getRanking(10, A);
        A.printAwards("Best school in spelling B", "Best footballing school", "Best school in mathematics", A);

        Classroom science = new Classroom("1500ssqm", "Square", 50, 90);

        System.out.println(science.getTotalMaleStudent() + "Male student");
        System.out.println(science.getTotalFemaleStudent() + "Female student");

        science.populationSize(science);
        science.structureCost(500000);
        science.genderStat(science);

        Library myLibrary = new Library("Law", "golden yellow", "3000sqm");

        System.out.println(myLibrary.getKind());
        myLibrary.myPeriodicals("showbiz magazine");
        myLibrary.categoryBook("law");
        myLibrary.registerStudent(olumild);
        myLibrary.removeStudent(olumild);

        Teacher schoolTeacher = new Teacher("Prof Opoola", "phd", "Male");

        System.out.println(schoolTeacher.getName());
        schoolTeacher.getCategory("Mathematics");
        schoolTeacher.getStudentName(olumild);
        schoolTeacher.registerStudent(olumild);
        schoolTeacher.scheduleLecture();


    }
}
