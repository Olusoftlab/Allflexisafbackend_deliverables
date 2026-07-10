package pack.names;

@SuppressWarnings("java:S106")

public class Classroom implements ClassroomInfo {

    private String size;
    private String shape;
    private int totalMaleStudent;
    private int totalFemaleStudent;

    public Classroom(String size, String shape, int totalMaleStudent, int totalFemaleStudent) {

        this.setSize(size);
        this.setShape(shape);
        this.setTotalMaleStudent(totalMaleStudent);
        this.setTotalFemaleStudent(totalFemaleStudent);
    }

    public String getSize() {

        return this.size;
    }

    public void setSize(String size) {

        this.size = size;
    }

    public String getShape() {

        return this.shape;
    }

    public void setShape(String shape) {

        this.shape = shape;
    }

    public int getTotalMaleStudent() {

        return this.totalMaleStudent;
    }

    public void setTotalMaleStudent(int totalMaleStudent) {

        this.totalMaleStudent = totalMaleStudent;
    }

    public int getTotalFemaleStudent() {

        return this.totalFemaleStudent;
    }

    public void setTotalFemaleStudent(int totalFemaleStudent) {

        this.totalFemaleStudent = totalFemaleStudent;
    }

    @Override

    public void populationSize(Classroom c) {

        int result = c.getTotalMaleStudent() + c.getTotalFemaleStudent();

        System.out.println("total student in class is " + result);

    }

    @Override

    public void structureCost(int a) {

        System.out.println("Total cost of building class is " + a);

    }

    @Override

    public void genderStat(Classroom c) {

        System.out.println("Number of female in class is " + c.getTotalFemaleStudent() + ", "
                + "total number of male in class is " + c.getTotalMaleStudent());

    }

}