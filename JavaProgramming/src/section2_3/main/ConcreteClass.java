package section2_3.main;

public class ConcreteClass extends AbstractClass{

	//Properties
	public int password;
	
	
	//Constructor padrão
	public ConcreteClass(){
	};
	
	public ConcreteClass(int password){
		this.password =password;
	};
	
	//Behaviors
	@Override
	public void sayHello() {
		System.out.println("EAEAEAEE");
	}
	
	public void originalSayHello() {
		
		super.sayHello();
	}

	@Override
	public void sayHi() {
		System.out.println("HI");
		
	}
	
	@Override
	 public void InterfaceMethod2()
		{
			System.out.println("método2 da interface1 ");
			
			
		};
}
