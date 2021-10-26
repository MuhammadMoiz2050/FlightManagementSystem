package main;

public class Flight {
	String source;
	String destination;
	int ticketNo;
	String flightDepartureTime;
	String flightArrivalTime;
	int flightClass;
	String flightDate;
	int Seats[];
	
	public Flight() {
		source = "";
		destination = "";
		ticketNo = 0;
		flightArrivalTime = "";
		flightDepartureTime = "";
		flightClass = 0;
		for(int i=0;i<50;i++) {
		Seats[i]=0;
		}
	};
	
	public Flight(String s, String d, String fT, int fC,String fD, String date, int ticketN) {
		source = s;
		destination = d;
		ticketNo = ticketN;
		flightArrivalTime = fT;
		flightDepartureTime = fD;
		flightClass = fC;
		flightDate = date;
		if(fC == 1)                   //throw an exception here
		Seats = new int[10];
		else if(fC == 2) 
		Seats = new int[5];
		else if(fC==3)
		Seats = new int[3];
		ticketNo = ticketN;
			
	};
	
	public void seatReservation(int Seats[]) {
		int size = Seats.length;
		int i=0;
		if(Seats[i]!=1) {
			System.out.println("Seat is reserved.");
			Seats[i]=1;
			i++;
		}
		else
			System.out.println("Selected class is full.");
	};
	
	
}
