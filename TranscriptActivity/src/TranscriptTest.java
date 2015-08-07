import org.junit.* ;
import java.util.ArrayList;
import static org.junit.Assert.* ;
public class TranscriptTest {   
	

	@Test
	public void test_returnCorrectOverallGPA() {
	      System.out.println("Test correct OverallGPA is returned...") ;
	      Transcript transcript=new Transcript();
	      CourseEnrollment courseenrollment=new  CourseEnrollment("english",4,"B");
	      courseenrollment.setGpa(3.0);	    
	      transcript.addCourse(courseenrollment);	
	      CourseEnrollment courseenrollment2=new  CourseEnrollment("english",4,"A");
	      D.setGpa(4.0);	    
	      transcript.addCourse(D);	      
	      assertTrue(transcript.getOverallGPA()==3.5) ;
	   }
	
	@Test
	public void test_addCorrectCourse() {
	      System.out.println("Test correct Course is added...") ;
	      CourseEnrollment courseenrollment=new  CourseEnrollment("english",4,"B");
	      Transcript transcript=new Transcript();
	      transcript.addCourse(C);
	      ArrayList<CourseEnrollment>Returned=transcript.getTranscript();
	      assertTrue(Returned.get(0).getCourseCode()=="english") ;
	   }
	@Test
	public void test_returnCorrectFormattedOverallGPA() {
	      System.out.println("Test correct Formatted OverallGPA is returned...") ;
	      Transcript transcript=new Transcript();
	      CourseEnrollment courseenrollment=new  CourseEnrollment("english",4,"B");
	      courseenrollment.setGpa(3.0);	    
	      transcript.addCourse(courseenrollment);	
	      CourseEnrollment courseenrollment2=new  CourseEnrollment("english",4,"A");
	      courseenrollment2.setGpa(4.0);	    
	      transcript.addCourse(courseenrollment2);	      
	      assertTrue(Transcript.getFormattedOverallGPA(transcript.getOverallGPA()).equals("3.50")) ;
	   }
	
	   
}
