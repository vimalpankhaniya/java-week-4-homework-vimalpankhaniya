package encapsulation26;

public class TestEncapsulation {
    public static void main(String [] args){
        Encapsulate obj=new Encapsulate();
        // setting values of the variable
        obj.setName("Vimal");
        obj.getAge();
        obj.getRollno();

        // Displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: "+ obj.getAge());
        System.out.println("Prime's rollNo: "+ obj.getRollno());

        //Direct access of rollNo is not possible due to encapsulation
    }
}
