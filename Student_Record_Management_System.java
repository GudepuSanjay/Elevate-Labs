import java.util.ArrayList;
import java.util.Scanner;
class Student{
    private int id;
    private String name;
    private double marks;
public Student(int id,String name,double marks){
    this.id=id;
    this.name=name;
    this.marks=marks;
}
public int getId(){
   return id;
}
public String getName(){
    return name;
}
public void setName(String name)
{
    this.name=name;
}
public double getMarks(){
    return marks;
}
public void setMarks(double marks){
    this.marks=marks;
}

@Override
public String toString(){
    return "Student Id:" +id + ", Name: " + name + ", Marks: " + marks;
}
}

public class Student_Record_Management_System {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        Scanner object=new Scanner(System.in);

        while(true){
            System.out.println("Choose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            int choice = object.nextInt();
            object.nextLine(); 

            switch(choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = object.nextInt();
                    object.nextLine(); 
                    System.out.print("Enter Student Name: ");
                    String name = object.nextLine();
                    System.out.print("Enter Student Marks: ");
                    double marks = object.nextDouble();
                    students.add(new Student(id, name, marks));
                    break;

                case 2:
                    for(Student student : students) {
                        System.out.println(student);
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to update: ");
                    int updateId = object.nextInt();
                    for(Student student : students) {
                        if(student.getId() == updateId) {
                            System.out.print("Enter new Name: ");
                            String newName = object.next();
                            student.setName(newName);
                            System.out.print("Enter new Marks: ");
                            double newMarks = object.nextDouble();
                            student.setMarks(newMarks);
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = object.nextInt();
                    Student toRemove = null;
                    for(Student student : students) {
                        if(student.getId() == deleteId) {
                            toRemove = student;
                            break;
                        }
                    }
                    if(toRemove!=null)
                    {
                        students.remove(toRemove);
                        System.out.println("Student with ID " + deleteId + " has been removed.");
                    }
                    else{
                        System.out.println("Student with ID " + deleteId + " not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
