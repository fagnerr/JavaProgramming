package section2_3.auxiliary;

import java.util.Scanner;

import section2_3.main.AbstractClass;
import section2_3.main.ConcreteClass;
import section2_3.main.ConcreteClass1;
import section2_3.main.ConcreteClass2;
import section2_3.main.Tools;

public class AuxiliaryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Início do Roteiro 1");
		ConcreteClass1 cc1 = new ConcreteClass1(); //Chamada do método construtor....
		ConcreteClass2 cc2 = new ConcreteClass2(); //Chamada do método construtor....
		
		System.out.println(cc1.getPassword());
		//System.out.println(cc2.password);
		
		System.out.println("fim do Roteiro 1");
		
		System.out.println("................");
		
		System.out.println("Início do Roteiro 2");
		
		
		//COM POLIMORFISMO
		AbstractClass ac1=new ConcreteClass();
		System.out.println(ac1.password);
		
		
		//SEM POLIMORFISMO
		ConcreteClass ac2=new ConcreteClass();
		System.out.println(ac2.password);
		
		
		ac1.sayHello();
		ac2.sayHello();
		ac2.originalSayHello();
		ac2.sayHi();
		ac1.sayHi();

		System.out.println("fim do Roteiro 2");
		
		
		
		System.out.println("................");
		System.out.println("Início do Roteiro 4");
		
		
		ConcreteClass cc3=new ConcreteClass();
		
		System.out.println(ac1.interfaceVar);
		
		System.out.println(cc3.interfaceVar);
		
		AuxiliaryClass aux = new AuxiliaryClass();
		
		//aux.interfaceVar=false; Não é permitido
		
		System.out.println(aux.interfaceVar);
		ac1.InterfaceMethod1();
		System.out.println("fim do Roteiro 4");

		
		
		System.out.println("................");
		System.out.println("Início do Roteiro 6");
		/*Tools T2=new Tools();
		Tools T3=new Tools();
		
		T2.option='B';
		T3.option='C';
		
		System.out.println(T2.option);
		System.out.println(T3.option);
		
		Tools.option='D';
		System.out.println(Tools.option);
		Tools.printOption();
		
		T2.alternative='B';
		T3.alternative='C';
		System.out.println(T2.alternative);
		System.out.println(T3.alternative);*/	
		
		Tools.display("Teste");
		Tools.display(25.32);
		Tools.display(25.36566565656542);
		Object value=Tools.sum(50430, 67009);
		
		System.out.println(value);
		
		System.out.println("fim do Roteiro 6");
		
		System.out.println("................");
		System.out.println("Início do Roteiro 7");
		
		ConcreteClass2 cc4=new ConcreteClass2(8950);
		
		System.out.println(cc4);
		

		
	}

}
