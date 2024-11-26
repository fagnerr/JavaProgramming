package section2_3.samples.animal;

public abstract class Fish extends Chordate  implements Aquatic {

	
	public Fish()
	{}	
	
	public Fish(String scientificName,String popularName,int age,double mass) {
		super(scientificName,popularName,age,mass);
		
	}
	
	
	public void swing() {
		System.out.println("peixe nadando");
		
	}
	
	
}
