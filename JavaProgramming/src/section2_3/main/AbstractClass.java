package section2_3.main;


public abstract class AbstractClass implements Interface1,Interface2 {
	
	//Properties
	public long password;
	
	public AbstractClass()
	{
		password=9999;
	}
	
	public AbstractClass(long password)
	{
		this.password=password;
	}
	
	//Behaviors
	public void sayHello() {
		System.out.println("Olá!");
	}
	
	
	public abstract void sayHi(); 
	
}
