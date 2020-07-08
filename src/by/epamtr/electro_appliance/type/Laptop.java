package by.epamtr.electro_appliance.type;

public class Laptop extends ElectroAppliance {

	private double batteryCapacity;
	private String operationSystem;
	private int memoryRom;
	private int systemMemory;
	private double frequencyCPU;
	private int sizeDisplay;

	public Laptop(double batteryCapacity, String operationSystem, int memoryRom, int systemMemory, double frequencyCPU,
			int sizeDisplay) {
		super();
		setName("Laptop");
		this.batteryCapacity = batteryCapacity;
		this.operationSystem = operationSystem;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.frequencyCPU = frequencyCPU;
		this.sizeDisplay = sizeDisplay;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBattetyCapacity(double battetyCapacity) {
		this.batteryCapacity = battetyCapacity;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoeyRom) {
		this.memoryRom = memoeyRom;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getFrequencyCPU() {
		return frequencyCPU;
	}

	public void setFrequencyCPU(double frequencyCPU) {
		this.frequencyCPU = frequencyCPU;
	}

	public int getSizeDisplay() {
		return sizeDisplay;
	}

	public void setSizeDisplay(int sizeDisplay) {
		this.sizeDisplay = sizeDisplay;
	}

	@Override
	public String toString() {
		return "Name : " + getName() + ", battery capacity = " + getBatteryCapacity() + ", OS = " + getOperationSystem()
				+ ", memory ROM = " + getMemoryRom() + ", system memory =" + getSystemMemory() + ", CPU = "
				+ getFrequencyCPU() + ", display inches = " + getSizeDisplay();
	}

}
