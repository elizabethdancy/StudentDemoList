
package studentlistdemo;

/**
 * A class that models Student Objects
 * @author dancye
 */
public class Student {

    private String name;
    private String studentID;
    private String address;

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

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
