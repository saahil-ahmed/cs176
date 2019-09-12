package s1219200.cs176.lab02;

public class Student {
	
	private String name;
	private String studentID;
	private String email;
	private String major;
	private Integer classLevel;
	private String advisor;
	private Double credits;
	private Integer graduationYear;
	
	/**
	 * @param name - full name
	 * @param sID - student ID
	 * @param email - school email
	 * @param major - student's Major
	 * @paramclassLEvel - class level 1 thru 4
	 * @param advisor - student's advisor
	 * @param credits - course credit
	 * @param graduationYear - year of graduation
	 */
	
	Student (String name, String sID, String email, String major, Integer classLevel ,
			String advisor, Double credits, Integer graduationYear) {
		this.name=name;
		this.studentID = sID;
		this.email=email;
		this.major=major;
		this.classLevel=classLevel;
		this.advisor=advisor;
		this.credits=credits;
		this.graduationYear=graduationYear;
	
	}
	/**
	 * Getter method for major
	 * @param major
	 */
	public void setMajor (String major) {
		this.major=major;
		
	}
	public String getMajor () {
		return this.major;
	}
	public void setGraduationYear (Integer graduationYear) {
		this.graduationYear=graduationYear;
	}
	public String getsID () {
		return this.studentID;
	}
	public String getEmail () {
		return this.email;
	}
	//over object to return string
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return
				"Name: " + this.name + "\n" +
				"Student ID: " + this.studentID + "\n" +
				"Email: " + this.email + "\n" +
				"Major: " + this.major + "\n" +
				"Class: " + this.classLevel + "\n" +
				"Advisor: " + this.advisor + "\n" +
				"Credits: " + this.credits + "\n" +
				"GraduationYear: " + this.graduationYear + "\n" ;
		
	}
}
