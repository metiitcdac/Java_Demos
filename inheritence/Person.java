package inheritence;

public class Person {
	protected String fName;
	protected String lName;
	protected String cName;
	protected int seatNo;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String fName, String lName, String cName, int seatNo) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.cName = cName;
		this.seatNo = seatNo;
	}
	
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", cName=" + cName + "]";
	}
	 
}
