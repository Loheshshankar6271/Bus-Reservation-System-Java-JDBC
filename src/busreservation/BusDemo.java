package busreservation;

import java.util.Scanner; //nested package/ hierarchical package
import java.sql.SQLException;
public class BusDemo {

	public static void main(String[] args) throws SQLException {
		
		
		
		BusDAO obj =new BusDAO();
		obj.displaybusInfo();
		

		
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		
		
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and 2 to exit");
			userOpt = scanner.nextInt();
			if(userOpt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable()) {
				BookingDAO obj2 =new BookingDAO();
				obj2.addBooking(booking);
					System.out.println("Your booking is confirmed");
				}
				else
					System.out.println("Sorry. Bus is full. Try another bus or date.");
			}
		}
	}

}