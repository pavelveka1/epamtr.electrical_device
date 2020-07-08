package by.epamtr.electro_appliance.action;

import java.util.List;
import by.epamtr.electro_appliance.type.*;

public class Main {

	public static void main(String[] args) {

		Catalog catalogAppliances = new Catalog("C:\\Users\\HP\\appliances_db.txt");
		List<ElectroAppliance> selectedDevices = catalogAppliances.findAppliance("Refrigerator", "OVERALL_CAPACITY",
				"300");
		for (ElectroAppliance device : selectedDevices) {
			System.out.println(device);
		}
	}
}
