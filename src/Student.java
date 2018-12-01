//Encapsulation - Using private information by setter and getter.
public class Student {
	private String name;
	private int studentID;
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getstudentID() {
		return studentID;
	}
	public void setstudentID(int studentID) {
		this.studentID=studentID;
	}	
}
