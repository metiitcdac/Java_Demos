package inheritence;

public class Student extends Person {

	private int rollNo;
	private int marks;
	private String course;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, int marks, String course) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.course = course;
	}

	public Student(String fName, String lName, String cName, int seatNo, int rollNo, int marks, String course) {
		super(fName, lName, cName, seatNo);
		this.rollNo = rollNo;
		this.marks = marks;
		this.course = course;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public void toLearn() {
		System.out.println(fName+" is learning "+ course+" in "+cName+" college");
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", course=" + course + ", fName=" + fName + ", lName="
				+ lName + ", cName=" + cName + ", seatNo=" + seatNo + "]";
	}

	
}
