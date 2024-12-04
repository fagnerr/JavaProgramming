package teste;

public class Teste {

	public static void drawLegs(){
        System.out.println("     ||     ||      ");
        System.out.println("     ||     ||      ");
        System.out.println("    (||)   (||)     ");
    }
    
    public static void main(String[] args) {
        System.out.println("   /\\         /\\   ");
        System.out.println("  /  \\_______/  \\  ");
        System.out.println(" /               \\ ");
        System.out.println("(  /\\         /\\  )");
        System.out.println("====     V     ====");
        System.out.println("======(__|__)======");
        System.out.println("  (             )  ");
        System.out.println("   (___________)   ");

        drawLegs();
		

		/*String s2=new String("this is a string.");
		String s3="string.";

		String s4="this is a " + s3;
		
		System.out.println(s1 ==s2);
		
		System.out.println(s1 == s4);
		System.out.println(s1.length());
		System.out.println(s4.indexOf("is a"));
		System.out.println(s4.charAt(7));
		int x = 22, y = 10;
		double p = Math.sqrt( ( x + y ) /2);*/
		int array[][] = {{1,2,3},{3,2,1}};
		for(int i=0;i<2;i++)
		for(int j=0;j<3;j++)
		System.out.print(2*array[1][1]);

	}

}
