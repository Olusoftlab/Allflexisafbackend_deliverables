package pack.names;

import java.time.LocalDate;

@SuppressWarnings("java:S106")

public class Teacher extends TeacherCategory implements TeacherInfo {

    private String name;
    private String qualification;
    private String gender;

    public Teacher(String name, String qualification, String gender) {

        this.setName(name);
        this.setQualification(qualification);
        this.setGender(gender);
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getQualification() {

        return this.qualification;

    }

    public void setQualification(String qualification) {

        this.qualification = qualification;
    }

    public String getGender() {

        return this.gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    @Override

    public void getCategory(String a) {

        System.out.println("The teacher belongs to" + a + "category");

    }

    @Override

    public void getStudentName(Student s) {

        System.out.println("the name of the student is " + s.getName());

    }

    @Override

    public void registerStudent(Student s) {

        System.out.println(s.getName() + " has been registered");
    }

    @Override

    public void scheduleLecture() {

        LocalDate myDate = LocalDate.parse("2026-10-24");

        System.out.println("the lecture has been schedule to " + myDate);

    }

}