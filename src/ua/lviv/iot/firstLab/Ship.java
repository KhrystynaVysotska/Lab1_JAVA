package ua.lviv.iot.firstLab;

public class Ship {
	public static final int SIZE_OF_OBJECTS_ARRAY = 4;

	public static int numberOfShips;

	private double tonnazhOfShip;

	private String nameOfShip;

	private int numberOfPassengers;

	private String typeOfShip;

	private double lengthOfShip;

	protected double speedOfShip;

	protected double widthOfShip;

	public Ship() {
		numberOfShips++;
	}

	public Ship(double tonnazh, String name, int passengers, String type, double length, double speed, double width) {
		tonnazhOfShip = tonnazh;
		nameOfShip = name;
		numberOfPassengers = passengers;
		typeOfShip = type;
		lengthOfShip = length;
		speedOfShip = speed;
		widthOfShip = width;
		numberOfShips++;
	}

	public Ship(double tonnazh, String name, int passengers, String type) {
		this(tonnazh, name, passengers, type, 0.0, 0.0, 0.0);
	}

	public double getTonnazhOfShip() {
		return tonnazhOfShip;
	}

	public void setTonnazhOfShip(double tonnazhOfShip) {
		this.tonnazhOfShip = tonnazhOfShip;
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

	public double getLengthOfShip() {
		return lengthOfShip;
	}

	public void setLengthOfShip(double lengthOfShip) {
		this.lengthOfShip = lengthOfShip;
	}

	public double getSpeedOfShip() {
		return speedOfShip;
	}

	public void setSpeedOfShip(double speedOfShip) {
		this.speedOfShip = speedOfShip;
	}

	public double getWidthOfShip() {
		return widthOfShip;
	}

	public void setWidthOfShip(double widthOfShip) {
		this.widthOfShip = widthOfShip;
	}

	public String toString() {
		return "Name of ship:           " + nameOfShip + "\n" + "Tonnazh of ship:        " + tonnazhOfShip + " t\n"
				+ "Amount of passengers:   " + numberOfPassengers + "\n" + "Type of ship:           " + typeOfShip
				+ "\n" + "Length of ship:         " + lengthOfShip + " m\n" + "Speed of ship:          " + speedOfShip
				+ " miles/hour\n" + "Width of ship:          " + widthOfShip + " m\n";
	}

	public static void printStaticNumberOfShips() {
		System.out.println("Now we have " + numberOfShips + " ships");

	}

	public void printNumberOfShips() {
		System.out.println("Now we have " + numberOfShips + " ships");

	}

	public void resetValues(double tonnazh_, String name_, int passengers_, String type_, double length_, double speed_,
			double width_) {
		tonnazhOfShip = tonnazh_;
		nameOfShip = name_;
		numberOfPassengers = passengers_;
		typeOfShip = type_;
		lengthOfShip = length_;
		speedOfShip = speed_;
		widthOfShip = width_;
	}
}
