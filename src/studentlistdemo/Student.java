
package studentlistdemo;

/**
 * A class that models Student Objects
 * @author dancye
 */
public class Student {

    private String name;
    private String studentID;

    public Student(String givenName) 
    {
        name = givenName;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String givenName) 
    {
        name = givenName;
    }

    public String getStudentID() 
    {
        return studentID;
    }

    public void setStudentID(String studentID) 
    {
        this.studentID = studentID;
    }
}
