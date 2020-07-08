package by.epamtr.electro_appliance.type;

public class VacuumCleaner extends ElectroAppliance {

	private int powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private int motorSpeed;
	private int cleaningWidth;

	public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType, int motorSpeed,
			int cleaningWidth) {
		super();
		setName("Vacuum cleaner");
		this.powerConsumption = powerConsumption;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeed = motorSpeed;
		this.cleaningWidth = cleaningWidth;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public int getMotorSpeed() {
		return motorSpeed;
	}

	public void setMotorSpeed(int motorSpeed) {
		this.motorSpeed = motorSpeed;
	}

	public int getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	@Override
	public String toString() {
		return "Name : " + getName() + ", power consumption = " + getPowerConsumption() + ", filter type = "
				+ getFilterType() + ", bag type = " + getBagType() + ", wand type = " + getWandType()
				+ ", motor speed = " + getMotorSpeed() + ", cleaning width = " + getCleaningWidth();
	}

}
