package employee;

import abstractions.Employee;
import interfaces.Developing;
import interfaces.UpdateTimeSheet;

public class Developer extends Employee implements Developing,UpdateTimeSheet  {

	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Work as a Developer");
	}

	//
	@Override
	public void createLog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTimeLog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void coding() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unitTesting() {
		// TODO Auto-generated method stub
		
	}

}
