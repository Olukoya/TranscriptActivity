//COURSE ENROLLMENT
public class CourseEnrollment
{
	private String courseCode, grade;
    private int credits;
    private double qualityPoints;

    public CourseEnrollment(){
        this.courseCode = "";
        this.grade = "";
        this.credits = 0;
        this.qualityPoints = 0.0;
    }

    public String getCourseCode() {
		return courseCode;
	}



	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public int getCredits() {
		return credits;
	}



	public void setCredits(int credits) {
		this.credits = credits;
	}



	public double getQualityPoints() {
		return qualityPoints;
	}



	public void setQualityPoints(String grade) {
		

	if(grade.equalsIgnoreCase("A"))
		qualityPoints = 4.0;
	else if(grade.equalsIgnoreCase("B"))
		qualityPoints = 3.0;
	else if(grade.equalsIgnoreCase("C"))
		qualityPoints = 2.0;
	else if (grade.equalsIgnoreCase("D"))
		qualityPoints = 1.0;
	else if (grade.equalsIgnoreCase("F"))
		qualityPoints = 0.0;
	else
		System.out.println("Invalid Operation");
	//this.qualityPoints = qualityPoints;
	}
	
	@Override
	public String toString() {
		return courseCode + credits + grade + qualityPoints;
	}
    
    
}
