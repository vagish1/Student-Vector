package Utils;

public class Student {
    
    private int roll;
    private String name;
    private String email;
    private String phone;
    private String address;


    public Student(int r, String n, String e, String p, String a){

        roll = r;
        name=n;
        email =e;
        phone = p;
        address = a;
    }


    public int getRoll() {
        return roll;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }


}
