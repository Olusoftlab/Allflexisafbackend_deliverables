package practiceclass;

public class LocalClass {

     // demonstrate local classes

     public void getFullName(String firstName, String lastName) {

          class FullName {

               String firstName;
               String lastName;

               private int totalLength;

               FullName(String firstName, String lastName) {

                    totalLength = firstName.length() + lastName.length();

                    this.firstName = firstName;
                    this.lastName = lastName;

               }

               public void getInfo() {

                    System.out.println("Your full name is " + firstName + " " + lastName + " and total length is "
                              + totalLength);

               }

          }

          FullName myFullName = new FullName(firstName, lastName);

          myFullName.getInfo();

     }

}
