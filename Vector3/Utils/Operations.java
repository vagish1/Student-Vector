package Utils;
import java.util.Vector;


public class Operations {
    

    private Vector<Student> stu ;
    

    public Operations(){
        
        stu = new Vector<>();
    }



    public void addToStudent(Student student){
        stu.add(student);
    }


    public Student getStudentAtIndex(int index){
        Student st =     stu.get(index);    
        return st;
    }


    public boolean searchStudent(int rollNo){


        if(stu.isEmpty()){
            System.out.println("Database is Empty");
            return false;
        }

        for(Student st : stu){

            if(st.getRoll() == rollNo){
                return true;
            }

        }

        return false;

    }

}
