package encapsulation26;

public class Encapsulate {
    // private varibales declared these can only be accessed by public method of class

    private String name;
    private int rollNo;
    private int age;

    // get method for name to acess provate variable name
    public String getName(){
        return name;
    }
    // set the method for name to acess private variable name
    public void setName(String name){
        this.name =name;
    }
    // get method for roll to access private variable rollno
    public int getRollno(){
    return rollNo;
    }
    // set method for roll to access private variable rollNo
    public void setRollNo (int rollNo){
        this.rollNo=rollNo;
    }
    // get methof for age to access private variable age
    public int getAge(){
        return age;
    }
    // set method for age to access private variable age
    public void setAge(int age){
        this.age=age;
    }


}