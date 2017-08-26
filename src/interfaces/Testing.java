package interfaces;

//Always public / even if it's stated or not
public interface Testing {
	//Public abstract, these methods don't have the body section and need to be implemented in the child class
	public abstract void writeTestCases();
	void executeTestCases();
	
	//Public default and static.
	public static void reportBug() {
		System.out.println("reporting bug");
	}
	//Default methods can be overriden in implementing class, while static cannot.
	public default void reportIssue() {
		System.out.println("reporting issue");
	}
	
}
