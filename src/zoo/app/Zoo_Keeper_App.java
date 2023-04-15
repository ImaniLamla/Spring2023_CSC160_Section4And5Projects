package zoo.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import zoo.animal.*;

public class Zoo_Keeper_App {
	
	private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.US); 
	
	public Zoo_Keeper_App() {
		//no house keeping
	}

	public static void main(String[] args) {
		
		try {
			
			/* Animal a1 = new Animal();
			Animal a2 = new Animal("12-31-2022", (float) 10.5);
			Animal a3 = new Animal(LocalDate.parse("11-30-2022", FORMAT), (float) 5.5);
			
			System.out.println(a1);
			System.out.println(a2);
			System.out.println(a3);
			
			System.out.println();
			
			System.out.println(a1.getBirthdateStr() + " " + a1.getWeight());
			System.out.println(a2.getBirthdate() + " " + a2.getWeight());
			System.out.println(a3.getBirthdateStr() + " " + a3.getWeight());
			
			System.out.println();
			
			a2.setGender("male");
			a3.setGender(Gender.FEMALE);
			
			System.out.println(a1.getGender());
			System.out.println(a2.getGender());
			System.out.println(a3.getGender());
			*/
			
			Guppy f1 = new Guppy("12-31-2022", (float) 1.5, Water.SALT);
			f1.setGender("m");
			f1.drift();
			//f1.setWater("salt");
			
			System.out.println(f1 + " " + f1.getWater() + " " + f1.getGender());
			
			
		} catch(Exception e) {
			System.out.println("The following message has occurred: ");
			System.out.println(e.getMessage());
		}	
	}
}
