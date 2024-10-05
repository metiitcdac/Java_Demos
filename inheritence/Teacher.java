package inheritence;

public class Teacher extends Person {

	private int id;
	private String sub;
	private int sal;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String sub, int sal) {
		super();
		this.id = id;
		this.sub = sub;
		this.sal = sal;
	}

	public Teacher(String fName, String lName, String cName,int seatNo, int id, String sub, int sal) {
		super(fName, lName, cName, seatNo);
		this.id = id;
		this.sub = sub;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public void toTeach() {
		System.out.println(fName+" is teaching "+ sub +" in "+cName+" college.");
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", sub=" + sub + ", sal=" + sal + ", fName=" + fName + ", lName=" + lName
				+ ", cName=" + cName + ", seatNo=" + seatNo + "]";
	}

}
