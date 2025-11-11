
public class Flights {
	String Scheduled, Flight, Destination, Status;
	int Gate;

		public Flights(String scheduled, String flight, String destination, String status, int gate) {
			super();
			Scheduled = scheduled;
			Flight = flight;
			Destination = destination;
			Status = status;
			Gate = gate;
		}
		
		public void setArrivalTime() {
			Destination = "18:00";
		}
		public void setStatus(String msg) {
			Status = msg;
		}
		public String getStatus() {
			return Status;
		}
		public String getFlight() {
			return Flight;
		}
}
