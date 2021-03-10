package flights;

import static sbcc.Core.*;

import java.io.*;
import java.util.*;

import static java.lang.System.*;
import static org.apache.commons.lang3.StringUtils.*;

/**
 * 
 * @author Cody Cole
 *
 */
public class Main {
	static ArrayList<Flight> loadFlights(String fileName) {
		ArrayList<Flight> flights = new ArrayList();
		List<String> lines = null;
		try {
			lines = readFileAsLines(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (var line : lines) {
			String depart = substringBefore(line, " ");
			String arrive = substringBetween(line, "> ", ",");
			String airline = substringBetween(line, ", ", ",");
			String price = ((substringAfter(line, "$")));// Watch for parse

			Flight flight = new Flight(airline, depart, arrive, price);// Add arguments
			flights.add(flight);
		}
		return flights;
	}


	public static void main(String[] args) {
		var finalFlights = loadFlights("flights.txt");
		printf("%-16s%-8s%-8s%-5s%n", "AIRLINE", "FROM", "TO", "PRICE");
		printf("%-16s%-8s%-8s%-5s%n", "-------", "----", "--", "-----");

		for (var flight : finalFlights) {
			printf("%-16s%-8s%-8s$%-5s %n", flight.getAirline().trim(), flight.getDepart().trim(),
					flight.getArrive().trim(), flight.getPrice());
			// printf("%-16s %s%n", flight.getAirline(), flight.getDepart());
		}
	}
}
