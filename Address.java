import java.util.Queue;
import java.util.PriorityQueue;

public class Address{
    String HouseNumber;
	String StreetName;
	String CityName;
	Address(String HouseNumber,String StreetName,String city){
		hno =  HouseNumber;
		street = StreetName;
		city = CityName;
	}
	
	
	public static void main(String[] args){
	    Address a1 = new PriorityQueue();
		a1.add("172", "5151 highland road", "Baton Rouge");
		a1.offer("238", "550 Lee Drive", "Baton Rouge");
		a1.add("124", "430 Main Street", "Baker");
		System.out.println(a1);
		/*System.out.println("removed head element: "+a1.remove());
		System.out.println("After removing: "+ a1);
		System.out.println("removed head element: "+a1.poll());
		System.out.println("head element is: "+a1.element());
		System.out.println("final a1: "+ a1);*/
		}
	}	
	