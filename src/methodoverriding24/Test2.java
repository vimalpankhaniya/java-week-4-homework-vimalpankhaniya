package methodoverriding24;

public class Test2 {
     public static void main(String args[]){
         SBI s =new SBI();
         ICICI i = new ICICI();
         AXIS a= new AXIS();
         System.out.println("SBI Rate Of Interest:"+s.getRateOfInterest());
         System.out.println("ICICI Rate of Interest"+i.getRateOfInterest());
         System.out.println("AXIS Rate Of Interest:"+a.getRateOfInterest());

}}