package employee;

import abstractions.Employee;
import interfaces.Testing;
import interfaces.UpdateTimeSheet;

public class Tester extends Employee implements Testing, UpdateTimeSheet  {
	
	private boolean TestingMindset = true;
	//Abstract method from Employee - Abstract Class
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Work as a Tester");
	}

	
	//Abstract method from Testing Interface
	@Override
	public void writeTestCases() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeTestCases() {
		// TODO Auto-generated method stub
		
	}

	
	//Abstract method from UpdateTimeSheet interface
	@Override
	public void createLog() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateTimeLog() {
		// TODO Auto-generated method stub
		
	}


	//Testing mindset as an attribute that only tester has.
	public boolean isTestingMindset() {
		return TestingMindset;
	}


	public void setTestingMindset(boolean testingMindset) {
		TestingMindset = testingMindset;
	}

}
