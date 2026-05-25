package enumeration;
import java.util.ArrayList;

@SuppressWarnings("java:S106")
public class Daysofweek extends Alldays{

      public enum Day{

         SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
      }


  ArrayList<Day> daysOfTheWeek=new ArrayList<>();

      public Daysofweek(){

          for (Day d:Day.values()){

              daysOfTheWeek.add(d);

          }

      }


    @Override

    public void getAllDays(){

        for (Day d: daysOfTheWeek){

            System.out.print(d + ", ");
        }   

    }


}
