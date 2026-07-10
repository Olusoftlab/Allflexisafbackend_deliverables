package pack.names;
@SuppressWarnings("java:S106")


public class Library extends Periodicals implements LibraryInfo{
  
       private String kind;
       private String buildingColor;
       private String size;
     

     public Library(String kind, String buildingColor, String size){

        this.setKind(kind);
        this.setBuildingColor(buildingColor);
        this.setSize(size);


     }


     public String getKind(){

        return this.kind;
     }

     public void setKind(String kind){

         this.kind=kind;
     }


     public String getBuildingColor(){

          return this.buildingColor;
     }


    public void setBuildingColor(String buildingColor ){
 
       this.buildingColor=buildingColor;

    }   

   
    public String getSize(){

        return this.size;
    }

    public void setSize(String size){

         this.size=size;
    }



   @Override 

     public void myPeriodicals(String a){

         System.out.println("The library has " + a + " as a periodical");

     }

 @Override

     public void categoryBook(String s){

        System.out.println("Category of book  found in the library is  " + s);

     }

@Override

   public void  registerStudent(Student s){

         System.out.println(s.getName() + " has registered for the library");

   }


  @Override
  
   public void removeStudent(Student s){

     System.out.println(s.getName() + " was removed from the library register");
      
   }




}
