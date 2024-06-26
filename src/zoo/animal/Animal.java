package zoo.animal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Animal {
	
	private static int counter = 0;  
	
	protected static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.US);
	
	protected final int id;
	
	protected final String type = "Animal";
	
	private float weight;
	
	private LocalDate birthdate;
	
	protected Gender gender;
	
	public Animal() {
		
		this.id = ++Animal.counter;
		this.birthdate = null;
		this.weight = 0;
		this.gender = Gender.UNKNOWN;
		
	}
	
	public <T> Animal (T birthdate, float weight) throws Exception{
		
		this();
		this.setBirthdate(birthdate);
		this.setWeight(weight);
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public LocalDate getBirthdate() {
		return this.birthdate;
	}
	
	public String getBirthdateStr() {
		
		if (this.birthdate == null)
			return "Unknown";
		else 
			return Animal.FORMAT.format(this.birthdate);
	}
	
	public String getType() {
		return this.type;
	}
	
	public float getWeight() {
		return this.weight;
	}
	
	public Gender getGender() {
		return this.gender;
	}
	
	public <T> void setBirthdate(T birthdate) throws Exception{
		
		if (birthdate instanceof String) {
			this.birthdate = LocalDate.parse((String) birthdate, Animal.FORMAT);
		} 
		else if (birthdate instanceof LocalDate) {
			this.birthdate = (LocalDate) birthdate;
		}
		else {
			throw new Exception ("Invalid date MM-dd-yyyy: " + birthdate);
		}
		
	}
	
	public void setWeight(float weight) throws Exception{
		
		if (weight > 0) 
			this.weight = weight;
		else 
			throw new Exception("Invalid weight: " + weight);
		
	}
	
	public <T> void setGender(T gender) throws Exception{
		
		if (gender instanceof String) {
			String s = (String) gender;
			
			s = s.toLowerCase();
			
			switch (s) {
			case "m":
			case "male":
				this.gender = Gender.MALE;
				break;
			case "f":
			case "female":
				this.gender = Gender.FEMALE;
				break;
			default:
				throw new Exception("Invalid gender: " + s);
			}
		}
		else if (gender instanceof Gender) {
			this.gender = (Gender)gender;
		}
		else {
			throw new Exception("Invalid gender: " + gender);
		}
	}
	
	@Override //all objects have toString method that we are now overriding 
	public String toString() {
		
		return this.id + " " + this.type;
	}
	
	abstract public void eat(); 

}
