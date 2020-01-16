package ua.lviv.iot.firstLab;

public class ShipProduction {

	public static void main(String[] args) {

		Ship firstShip = new Ship();
		Ship secondShip = new Ship(3500, "Victoria", 850, "sailing ship");
		Ship thirdShip = new Ship(45324, "Olimpic", 2435, "passenger liner", 263.83, 42.5, 28.19);
		System.out.println(firstShip);
		System.out.println("---------------------------------------------");
		System.out.println(secondShip);
		System.out.println("---------------------------------------------");
		System.out.println(thirdShip + "\n");

		Ship.printStaticNumberOfShips();
		System.out.println("----------------Static method----------------\n");

		firstShip.printNumberOfShips();
		System.out.println("----------------Non-static method----------------\n");

		Ship[] objects = new Ship[Ship.SIZE_OF_OBJECTS_ARRAY];
		for (int counter = 0; counter < Ship.SIZE_OF_OBJECTS_ARRAY; counter++) {
			objects[counter] = new Ship();
		}

		System.out.println("--------Four objects created with the help of for loop--------\n");
		for (Ship objNumber : objects) {
			System.out.println(objNumber);
		}
	}

}
