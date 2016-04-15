/*
 * Make an ArrayList of this class ArrayList<Registration>
 */
package registeredstudents;

public class Registration {
    
    private String course;
    private int enrollment;
        
    public Registration(String course, int enrollment) {
        this.course = course;
        this.enrollment = enrollment;        
    }
    
    public String getCourse() {
        return this.course;
    }
    
    public int getEnrollment() {
        return this.enrollment;
    }
      
}
