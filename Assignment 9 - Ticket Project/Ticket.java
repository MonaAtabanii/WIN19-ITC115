import java.util.*;

public abstract class Ticket {
		double price;
		int ticketNumber;
		//Date d1 = new Date();
		
		//The constructor of a Ticket 
		public Ticket(int ticketNumber){
			this.ticketNumber = ticketNumber;
		}
		
		//getPrice method
		public abstract double getPrice();//{
			//return this.price;
		//}
		
		//toString returns ticket information as String
		public String toString(){
		    //String output = String.format("Number: %d, Price: $%.2f", this.ticketNumber, this.getPrice());
			//return output;
			return "Number: " + this.ticketNumber + ", Price: " + this.getPrice();
		}
		
		//return type of ticket depend on the event date
		//public String confirmTypeOfTicket (String eventDate) {
		//	return "";
		//}

}
