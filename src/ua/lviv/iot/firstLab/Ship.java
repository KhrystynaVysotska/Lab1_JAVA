package ua.lviv.iot.firstLab;

public class Ship {
	public static final int SIZE_OF_OBJECTS_ARRAY = 4;

	public static int numberOfShips;

	private double tonnazhOfShipInTonnes;

	private String nameOfShip;

	private int numberOfPassengers;

	private String typeOfShip;

	private double lengthOfShipInMetres;

	protected double speedOfShipInMilesPerHour;

	protected double widthOfShipInMetres;

	public Ship() {
		numberOfShips++;
	}

	public Ship(double tonnazhOfShipInTonnes, String nameOfShip, int numberOfPassengers, String typeOfShip, double lengthOfShipInMetres, double speedOfShipInMilesPerHour, double widthOfShipInMetres) {
		this.tonnazhOfShipInTonnes = tonnazhOfShipInTonnes;
		this.nameOfShip = nameOfShip;
		this.numberOfPassengers = numberOfPassengers;
		this.typeOfShip = typeOfShip;
		this.lengthOfShipInMetres = lengthOfShipInMetres;
		this.speedOfShipInMilesPerHour = speedOfShipInMilesPerHour;
		this.widthOfShipInMetres = widthOfShipInMetres;
		numberOfShips++;
	}

	public Ship(double tonnazhOfShipInTonnes, String nameOfShip, int numberOfPassengers, String typeOfShip) {
		this(tonnazhOfShipInTonnes,nameOfShip, numberOfPassengers, typeOfShip, 0.0, 0.0, 0.0);
	}

	public double getTonnazhOfShipInTonnes() {
		return tonnazhOfShipInTonnes;
	}

	public void setTonnazhOfShipInTonnes(double tonnazhOfShipInTonnes) {
		this.tonnazhOfShipInTonnes = tonnazhOfShipInTonnes;
	}

	public String getNameOfShip() {
		return nameOfShip;
	}

	public void setNameOfShip(String nameOfShip) {
		this.nameOfShip = nameOfShip;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public String getTypeOfShip() {
		return typeOfShip;
	}

	public void setTypeOfShip(String typeOfShip) {
		this.typeOfShip = typeOfShip;
	}

	public double getLengthOfShipInMetres() {
		return lengthOfShipInMetres;
	}

	public void setLengthOfShipInMetres(double lengthOfShipInMetres) {
		this.lengthOfShipInMetres = lengthOfShipInMetres;
	}

	public double getSpeedOfShipInMilesPerHour() {
		return speedOfShipInMilesPerHour;
	}

	public void setSpeedOfShipInMilesPerHour(double speedOfShipInMilesPerHour) {
		this.speedOfShipInMilesPerHour = speedOfShipInMilesPerHour;
	}

	public double getWidthOfShipInMetres() {
		return widthOfShipInMetres;
	}

	public void setWidthOfShip(double widthOfShipInMetres) {
		this.widthOfShipInMetres = widthOfShipInMetres;
	}

	public String toString() {
		return "Name of ship:           " + nameOfShip + "\n" + "Tonnazh of ship:        " + tonnazhOfShipInTonnes + " t\n"
				+ "Amount of passengers:   " + numberOfPassengers + "\n" + "Type of ship:           " + typeOfShip
				+ "\n" + "Length of ship:         " + lengthOfShipInMetres + " m\n" + "Speed of ship:          " + speedOfShipInMilesPerHour
				+ " miles/hour\n" + "Width of ship:          " + widthOfShipInMetres + " m\n";
	}

	public static void printStaticNumberOfShips() {
		System.out.println("Now we have " + numberOfShips + " ships");

	}

	public void printNumberOfShips() {
		System.out.println("Now we have " + numberOfShips + " ships");

	}

	public void resetValues(double tonnazh_, String name_, int passengers_, String type_, double length_, double speed_,
			double width_) {
		tonnazhOfShipInTonnes = tonnazh_;
		nameOfShip = name_;
		numberOfPassengers = passengers_;
		typeOfShip = type_;
		lengthOfShipInMetres = length_;
		speedOfShipInMilesPerHour = speed_;
		widthOfShipInMetres = width_;
	}
}
