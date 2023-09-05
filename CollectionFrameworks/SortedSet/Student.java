package SortedSet;

public class Student implements Comparable<Student> {
	private int studentId;
	private String studentName;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	@Override
	public int compareTo(Student s) {
		if(this.studentId<s.studentId)
			return -1;
		else if(this.studentId>s.studentId)
			return 1;
		else
			return 0;
	}
}
