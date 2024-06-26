package zoo.animal;

public class Guppy extends Fish implements Swim{
	
	protected final String type = "Guppy";

	public Guppy() {
		
		super();//calls parent constructor
		this.water = Water.UNKNOWN;
	}
	
	public <T> Guppy (T birthdate, float weight) throws Exception{
		
		super(birthdate, weight);
	}
	
	public <T> Guppy (T birthdate, float weight, T water) throws Exception{
		
		super(birthdate, weight, water);
	}
	
	@Override 
	public String toString() {
		
		return this.id + " " + this.type;
	}
	
	@Override
	public void eat() {
		
		System.out.println("This " + this.type + " is eating.");
	}

	@Override
	public void propel() {
		System.out.println("This " + this.type + " is propelling.");
		
	}

	@Override
	public void drift() {
		System.out.println("This " + this.type + " is drifting.");
		
	}

}
