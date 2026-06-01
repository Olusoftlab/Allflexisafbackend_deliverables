package hoursindays;

@SuppressWarnings("java:S106")

public class CalculateHoursInDays implements CalculateHours {

    public int numberOfDays;

    public CalculateHoursInDays() {

        this.numberOfDays = 0;

    }

    @Override

    public void getNumberOfDays(int days) {

        numberOfDays = days;

    }

    @Override

    public void calculateHoursOfDays() {

        int hoursOfDays = numberOfDays * 24;

        System.out.println("Number of  hours in " + numberOfDays + " days is " + hoursOfDays + " hours");

    }

}
