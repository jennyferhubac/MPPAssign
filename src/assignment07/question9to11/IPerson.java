package assignment07.question9to11;

public interface IPerson {
	default void myDefault()
	{
		System.out.println("From default method");
	}
	
	static void myStatic()
	{
		System.out.println("From static method");
	}
	
	void myAbstract();

}
