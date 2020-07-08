package by.epamtr.electro_appliance.type;

public class Oven extends ElectroAppliance {

	private int powerConsumption;
	private int weight;
	private int capacity;
	private int depth;
	private int height;
	private int width;

	public Oven(int powerConsumption, int weight, int capacity, int depth, int height, int width) {
		super();
		setName("Oven");
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
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

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
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
				+ ", capacity = " + getCapacity() + ", depth = " + getDepth() + ", height = " + getHeight()
				+ ", width = " + getWidth();
	}

}
