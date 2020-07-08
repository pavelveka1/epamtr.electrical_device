package by.epamtr.electro_appliance.type;

public class TabletPC extends ElectroAppliance {

	private double batteryCapacity;
	private int memoryRom;
	private int sizeDisplay;
	private int flashMemory;
	private String color;

	public TabletPC(double batteryCapacity, int sizeDisplay, int memoryRom, int flashMemory, String color) {
		super();
		setName("TabletPC");
		this.batteryCapacity = batteryCapacity;
		this.memoryRom = memoryRom;
		this.sizeDisplay = sizeDisplay;
		this.flashMemory = flashMemory;
		this.color = color;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public int getSizeDisplay() {
		return sizeDisplay;
	}

	public void setSizeDisplay(int sizeDisplay) {
		this.sizeDisplay = sizeDisplay;
	}

	public int getFlashMemory() {
		return flashMemory;
	}

	public void setFlashMemory(int flashMemory) {
		this.flashMemory = flashMemory;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Name :" + getName() + ", battery capacity = " + getBatteryCapacity() + ", flafh memory capacity = "
				+ getFlashMemory() + ", memory ROM = " + getMemoryRom() + ", display inches = " + getSizeDisplay()
				+ ", color = " + getColor();

	}

}
