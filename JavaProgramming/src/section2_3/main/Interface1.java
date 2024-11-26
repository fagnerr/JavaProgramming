package section2_3.main;

public interface Interface1 {
	
	public boolean interfaceVar=true;

	
	default void InterfaceMethod1()
	{
		System.out.println("método 1 da interface");
		
		
	};
	
	void InterfaceMethod2();
	
	
	
	
}
