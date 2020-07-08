package by.epamtr.electro_appliance.type;

public class Refrigerator extends ElectroAppliance {

	private int powerConsumption;
	private int weight;
	private int freezerCapacity;
	private int overallCapacity;
	private int height;
	private int width;

	public Refrigerator(int powerConsumption, int weight, int freezerCapacity, int overallCapacity, int height,
			int width) {
		super();
		setName("Refrigerator");
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public int getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(int overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Name : " + getName() + ", power consumption = " + getPowerConsumption() + ", weight = " + getWeight()
				+ ", freezer capacity =" + getFreezerCapacity() + ", overall capacity = " + getOverallCapacity()
				+ ", height = " + getHeight() + ", width = " + getWidth();

	}
}
