package flights;

public class Flight {

	String airline;
	String depart;
	String arrive;
	String price;

	public Flight(String airline, String depart, String arrive, String price) {
		super();
		this.airline = airline;
		this.depart = depart;
		this.arrive = arrive;
		this.price = price;
	}


	public String getAirline() {
		return airline;
	}


	public void setAirline(String airline) {
		this.airline = airline;
	}


	public String getDepart() {
		return depart;
	}


	public void setDepart(String depart) {
		this.depart = depart;
	}


	public String getArrive() {
		return arrive;
	}


	public void setArrive(String arrive) {
		this.arrive = arrive;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}

}
