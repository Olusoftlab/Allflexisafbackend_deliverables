package hoursindays;

@SuppressWarnings("java:S106")

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        CalculateHoursInDays hoursIndays = new CalculateHoursInDays();

        hoursIndays.getNumberOfDays(56);
        hoursIndays.calculateHoursOfDays();

    }
}
