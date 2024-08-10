package section2_3.instanceof_operator;

import section2_3.Bicicleta;
import section2_3.MountainBike;
import section2_3.RoadBike;

public class InstanceofTester {

	public static void main(String[] args) {

		/*	MountainBike mb1 = new MountainBike();
		RoadBike rb1 = new RoadBike();		
		Bicicleta mb2 = new MountainBike();
		Bicicleta rb2 = new RoadBike();
		 */

		Bicicleta[] bikes = new Bicicleta[5];
		bikes[0] = new MountainBike("MB001", "Aço Cabono", "Raios de Metal", 20, 18, 25.0, "Soft");
		bikes[1] = new RoadBike("RB001", "Slim Aço Cabono", "Raios de Plástico", 22, 24, 38.0,"Plug-in");

		for(Bicicleta temp: bikes) {
			if(temp instanceof RoadBike) {
				System.out.println(temp);
			}
		}
	}
}
