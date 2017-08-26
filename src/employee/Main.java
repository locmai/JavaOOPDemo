package employee;

public class Main {
	public static void main(String[] args) {
		Tester sontung = new Tester();
		sontung.work();
		sontung.reportIssue();
		
		Developer gdragon = new Developer();
		gdragon.work();
		
		System.out.println("====");
		
		EmployeeInfo info = new EmployeeInfo(sontung);
		info.employee.work();
		
		System.out.println("Son Tung has Testing mindset? " + ((Tester)info.employee).isTestingMindset());
	}
}
