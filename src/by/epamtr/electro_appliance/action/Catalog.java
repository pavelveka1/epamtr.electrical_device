package by.epamtr.electro_appliance.action;

import by.epamtr.electro_appliance.type.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import by.epamtr.electro_appliance.type.ElectroAppliance;
import by.epamtr.electro_appliance.type.Laptop;
import by.epamtr.electro_appliance.type.Oven;

public class Catalog {
	private Stream<String> stream;

	public Catalog(String filePath) {
		super();
		stream = getStreamAppliance(filePath);
	}

	private Stream<String> getStreamAppliance(String filePath) {
		try {
			Stream<String> stream = Files.lines(Paths.get(filePath));
			return stream;
		} catch (IOException e) {
			System.out.println("File is not found!");
		}
		return null;
	}

	public List<ElectroAppliance> findAppliance(String nameAppliance, String parameter, String parameterValue) {

		List<String> listAppropriateAppliance = stream.filter(line -> line.contains(nameAppliance))
				.filter(line -> line.contains(parameter + "=" + parameterValue)).collect(Collectors.toList());
		List<ElectroAppliance> selectedAppliances = makeElectroAppliance(listAppropriateAppliance, nameAppliance);
		return selectedAppliances;
	}

	private List<ElectroAppliance> makeElectroAppliance(List<String> listAppliance, String nameAppliance) {
		List<ElectroAppliance> appliances = new ArrayList<ElectroAppliance>();
		ElectroAppliance appliance;
		for (String lineParams : listAppliance) {
			appliance = makeDevice(nameAppliance, lineParams);
			appliances.add(appliance);
		}
		return appliances;

	}

	private ElectroAppliance makeDevice(String nameAppliance, String paramsLine) {
		ElectroAppliance appliance = null;
		String[] params = parseLine(paramsLine);
		switch (nameAppliance.trim().toLowerCase()) {
		case "oven":
			appliance = new Oven(Integer.parseInt(params[0]), Integer.parseInt(params[1]), Integer.parseInt(params[2]),
					Integer.parseInt(params[3]), Integer.parseInt(params[4]), Integer.parseInt(params[5]));
			break;
		case "laptop":
			appliance = new Laptop(Double.parseDouble(params[0]), params[1], Integer.parseInt(params[2]),
					Integer.parseInt(params[3]), Double.parseDouble(params[4]), Integer.parseInt(params[5]));
			break;
		case "refrigerator":
			appliance = new Refrigerator(Integer.parseInt(params[0]), Integer.parseInt(params[1]),
					Integer.parseInt(params[2]), Integer.parseInt(params[3]), Integer.parseInt(params[4]),
					Integer.parseInt(params[5]));
			break;
		case "vacuumcleaner":
			appliance = new VacuumCleaner(Integer.parseInt(params[0]), params[1], params[2], params[3],
					Integer.parseInt(params[4]), Integer.parseInt(params[5]));
			break;
		case "tabletpc":
			appliance = new TabletPC(Double.parseDouble(params[0]), Integer.parseInt(params[1]),
					Integer.parseInt(params[2]), Integer.parseInt(params[3]), params[4]);
			break;
		case "Speakers":
			appliance = new Speaker(Integer.parseInt(params[0]), Integer.parseInt(params[1]), params[2],
					Integer.parseInt(params[3]));
			break;
		}
		return appliance;
	}

	private String[] parseLine(String line) {
		int index = line.indexOf(":");
		line = line.substring(index + 1);
		String[] arrayParams = line.split(",");
		arrayParams = getOnlyParams(arrayParams);
		return arrayParams;
	}

	private String[] getOnlyParams(String[] array) {
		String param;
		for (int i = 0; i < array.length; i++) {
			param = array[i].replaceAll(".*=", "");
			array[i] = param;
		}
		return array;
	}

}
