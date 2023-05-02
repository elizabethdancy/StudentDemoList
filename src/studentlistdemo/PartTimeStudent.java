
package studentlistdemo;

/**
 * This class models a part-time student
 * @author dancye
 */
public class PartTimeStudent extends Student
{

    /**
     * @return the numCourses
     */
    public int getNumCourses() {
        return numCourses;
    }

    /**
     * @param numCourses the numCourses to set
     */
    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    private int numCourses;
    
    public PartTimeStudent(String name, int numCourses)
    {
        super(name);
        this.numCourses = numCourses;
    }
}
