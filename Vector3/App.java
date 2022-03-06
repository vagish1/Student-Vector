

import Utils.*;

public class App{
    public static void main(String[] args) {
        
        
        Operations op =  new Operations();
        
        while(true){
           System.out.println("1. Insert a Student ");
           System.out.println("2. Get a Stuent at Index");
           System.out.println("3. find a Student");
           System.out.println("4. Exit");
           
           
            int choice = Integer.parseInt(System.console().readLine());

            switch(choice){
                case 1: 

                    System.out.print("Enter the roll No : -> ");
                    int roll = Integer.parseInt(System.console().readLine());
                    System.out.print("Enter the name : -> ");
                    String name = System.console().readLine();
                    System.out.print("Enter the Email Id : -> ");
                    String email = System.console().readLine();
                    System.out.print("Enter the phone : -> ");
                    String phone = System.console().readLine();
                    System.out.print("Enter the address : -> ");
                    String address = System.console().readLine();


                    Student st =  new Student(roll, name, email, phone, address);
                    op.addToStudent(st);

                   break;
                case 2:
                System.out.print("Enter the Index : -> ");
                    int index = Integer.parseInt(System.console().readLine());
                    Student stu =  op.getStudentAtIndex(index);

                    System.out.println("Name -> "+ stu.getName());
                    System.out.println("Roll -> "+ stu.getRoll());
                    System.out.println("Phone -> "+ stu.getPhone());
                    System.out.println("Email -> "+ stu.getEmail());
                    System.out.println("Address -> "+ stu.getAddress());

                   break;
                case 3:
                System.out.print("Enter the RollNo : -> ");
                int rollNo = Integer.parseInt(System.console().readLine());
                Boolean b = op.searchStudent(rollNo);
                if(b){
                    System.out.println("Found");

                }else {
                    System.out.println("Not Found");
                }

                   break;
                case 4:
                   System.exit(0);
                   break;
            }


        }
      



    
    
       
        


    }
}