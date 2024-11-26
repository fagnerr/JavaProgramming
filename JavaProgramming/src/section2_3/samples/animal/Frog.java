package section2_3.samples.animal;

public class Frog extends Amphibian{

	public void born() {
		System.out.println("Sapo Nascendo");

	}
	
	public void eat() {
		System.out.println("Sapo Comendo");
	
	}

	public void grows() {
		System.out.println("Sapo Crescendo");
	
	}

	public void reproduces() {
		System.out.println("Sapo Reproduzindo");
		
		
	}
	
	public void die() {
		System.out.println("Sapo Falecendo");
		
		
	}

	@Override
	public void walk() {
		System.out.println("Sapo Pulando");
		
	}
	@Override
	public void swing() {
		System.out.println("Sapo Boiando");
		
	}
	
	

}
