package section2_3.samples.animal;

public class AnimalTester {

	public static void main(String[] args) {
		
		Sharks shark =new Sharks();
		
		Fish shark2 =new Sharks();
		
		shark.setScientificName("Galeocerdo cuvier");
		shark.setPopularName("Tubarão Tigre");
		shark.setAge(20);
		shark.setMass(250.0);
		
		
		System.out.println(shark.scientificName);
		System.out.println(shark.scientificName);
		System.out.println(shark.popularName);
		System.out.println(shark.age);
		System.out.println(shark.mass);
		
		
	
		shark.born();
		shark.eat();
		shark.grows();
		shark.reproduces();
		shark.die();
		shark.swing();
		shark2.swing();
		
		System.out.println(shark instanceof Fish);
		
		Animal Ani= new Sharks("teste","TESTE",1,2,7);
			
		System.out.println(Ani.scientificName);
	}

}
