package section2_3.main;
import java.util.*;

public class ConcreteClass2 extends ConcreteClass1{

	//Properties
		private int password;
		
		//Constructors
		
		//Constructor padrão
		public ConcreteClass2(){
		};
		
		public ConcreteClass2(int password){
			this.password =password;
		};
		
		public static Object InputInfos() {
			
			Scanner input =new Scanner(System.in);
			
			return input;
		}
		
}
