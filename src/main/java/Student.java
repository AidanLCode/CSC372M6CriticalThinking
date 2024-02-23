public class Student {
    // Student attributes
    int rollno;
    String name;
    String Address;

    //Constructor
    public Student(int rollno, String name, String Address){
        this.rollno = rollno;
        this.Address = Address;
        this.name = name;
    }
    @Override
    public String toString(){
        return "STUDENT NAME: " + name + ", ADDRESS: " + Address + ", ROLL NUMBER: " + rollno;
    }


}
