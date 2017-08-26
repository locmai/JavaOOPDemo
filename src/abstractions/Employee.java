package abstractions;

public abstract class Employee extends Person {
	private String staffId;
	public Employee () {
		
	}
	
	public abstract void work();

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
}
