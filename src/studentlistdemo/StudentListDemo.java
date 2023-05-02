
package studentlistdemo;

/**
 * A class that models an ArrayList of students
 * @author dancye, 2023
 */
public class StudentListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student[] students = new Student[1];
      students[0] = new Student("Liz");
      for(Student s : students)
      {
          System.out.println(s.getName());
      }
    }
    
}
