package section2_3.samples.animal;

public class Whale extends Mammal implements Aquatic{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	//behaviors
		public void born() {
			System.out.println("Whale Nascendo");

		}
		
		public void eat() {
			System.out.println("Whale Comendo");
		
		}

		public void grows() {
			System.out.println("Whale Crescendo");
		
		}

		public void reproduces() {
			System.out.println("Whale Reproduzindo");
			
			
		}
		
		public void die() {
			System.out.println("Whale Falecendo");
			
			
		}

		@Override
		public void swing() {
			System.out.println("Whale Nadando");
			
		}

}
