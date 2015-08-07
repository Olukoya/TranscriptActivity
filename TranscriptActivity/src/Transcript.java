//TRANSCRIPT
import java.util.*;
public class Transcript {

double sum, avgGPA = 0.0;
	private ArrayList<CourseEnrollment> outputCourse = new ArrayList<CourseEnrollment>();
	public void AddCourse(CourseEnrollment courseenrollment)
	{
		outputCourse.add(courseenrollment);
		System.out.println();
	}
	int itemCount = outputCourse.size();
	
	@Override
	public String toString() {
		String s = "";
		for(CourseEnrollment l : outputCourse){
		System.out.print(String.format("%-12s%-12s%-12s%-2s\n",l.getCourseCode(),l.getCredits(),l.getGrade(),l.getQualityPoints()));
		}
		return s;
	}
	
	public double getOverAllQP()
    {
        for (CourseEnrollment l : outputCourse){
        	sum += l.getQualityPoints();
        }
        return sum;
    }
        
	public double getOverAllGPA()
    {
		getOverAllQP();
        calculateGPA();
        return avgGPA;
    }

public void calculateGPA()
    {
        avgGPA = sum/outputCourse.size();
    }

}
