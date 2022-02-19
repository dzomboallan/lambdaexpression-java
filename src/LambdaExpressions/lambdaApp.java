package LambdaExpressions;

interface Cab{
    double bookCab(String Source , String Destination);
}


public class lambdaApp {
     public static void main(String[] args) {

         Cab cab = (Source,Destination)-> {
             System.out.println("Uber X booked from "+ Source+ " to " + Destination+ " arriving soon!!");
             return 800.50;
         };
         double fare =cab.bookCab("CBD","Ruai");
         System.out.println("Fare is: " + fare);

    }
}
