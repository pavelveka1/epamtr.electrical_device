package by.epamtr.electro_appliance.type;

public class Speaker extends ElectroAppliance {

	private int powerConsumption;
	private int numberOfSpeakers;
	private String frequencyRange;
	private int cordLenth;

	public Speaker(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLenth) {
		super();
		setName("Speakers");
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLenth = cordLenth;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

	public int getCordLenth() {
		return cordLenth;
	}

	public void setCordLenth(int cordLenth) {
		this.cordLenth = cordLenth;
	}

	@Override
	public String toString() {
		return "Name : " + getName() + ", power consumption = " + getPowerConsumption() + ", number of speakers = "
				+ getNumberOfSpeakers() + ", frequency range = " + getFrequencyRange() + ", cord lenth = "
				+ getCordLenth();
	}

}
