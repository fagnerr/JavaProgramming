package section2_3.samples.animal;

public class Sharks extends Fish{
	
	//Properties
	private int numberOfFins;
	
	public Sharks()
	{}	
	
	public Sharks (String scientificName,String popularName,int age,double mass,int numberOfFins) {
		
		super(scientificName,popularName,age,mass);	
		this.numberOfFins=numberOfFins;
		
	}
	
	
	String scientificName,popularName;
	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public String getPopularName() {
		return popularName;
	}

	public void setPopularName(String popularName) {
		this.popularName = popularName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	int age;
	double mass;
	
	
	public int getNumberOfFins() {
		return numberOfFins;
	}

	public void setNumberOfFins(int numberOfFins) {
		this.numberOfFins = numberOfFins;
	}

	
	
	//behaviors
	public void born() {
		System.out.println("Shark Nascendo");

	}
	
	public void eat() {
		System.out.println("Shark Comendo");
	
	}

	public void grows() {
		System.out.println("Shark Crescendo");
	
	}

	public void reproduces() {
		System.out.println("Shark Reproduzindo");
		
		
	}
	
	public void die() {
		System.out.println("Shark Falecendo");
		
		
	}


	public void swing() {
		System.out.println("Tubarão nadando");
		
	}
}
