package s1219200.cs176.lab02;

public class StudentList {
Student[] cs176students;
private int count = 0;

/**
 * Constructor for StudentList Class
 */
StudentList (int totalStudents){
	cs176students = new Student[totalStudents];
}
/**
 * @param s - new student object
 */

public Integer studentCount (String major) {
	Integer count = 0;
	for(Student S: cs176students) {
		if (S.getMajor()==major) {
			count++;
		}
	}
	
	return count;
}


public void addStudent (Student s) {
	cs176students[count]=s;
	count++;
}
public Student Find (String id) {
	Student foundStudent = null;
	for (Student s: cs176students) {
		if (s.getsID() == id) {
			return s;
		}
	}
	return foundStudent;
	
}
public Student getStudentInfo (String email) {
	Student emailInfo = null;
	for (Student s: cs176students) {
		if (s.getEmail() == email) {
			return s;
		}
	}
	return emailInfo;
	
		}

public boolean updateStudentGraduationYear(String studentID, Integer year) {
	boolean result = false;
	Student student = Find(studentID);
	if (student != null) {
		student.setGraduationYear(year);
		return true;
	}
	return result;
	
}


/**
 * List the students using for-each loop
 */
	public void listStudents() {
	for (Student s: cs176students) {
		System.out.println(s.toString());
	}}}

	
	



