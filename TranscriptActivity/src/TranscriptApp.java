//APP
import java.util.Scanner;

public class TranscriptApp {

	
	public static void main(String args[])
    {
    	Transcript transcript = new Transcript();
        // display a welcome message
        System.out.println(
            "Welcome to the Transcript Application");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            String courseCode = Validator.getString(sc, "Enter Course: ");
            int credits = Validator.getInt(sc, "Enter Credits (0-12): ", 0, 12);
            String grade = Validator.getString(sc, "Enter Grade (A,B,C,D or F): ");
            		
            // create the LineItem object and set its fields
            CourseEnrollment courseenrollment = new CourseEnrollment();
            courseenrollment.setCourseCode(courseCode);
            courseenrollment.setCredits(credits);
            courseenrollment.setGrade(grade);
            courseenrollment.setQualityPoints(grade);
            transcript.AddCourse(courseenrollment);
         
            // see if the user wants to continue
            choice = Validator.getString(
                sc, "Another course? (Y/N): ");
   
        
        }
        
        System.out.println("Course	  Credits  Grades	Quality Points\n"
        		         + "------------------------------------------------------");
        System.out.println(transcript);
        System.out.println();
        System.out.println("					GPA: " +transcript.getOverAllGPA());
    }
}

