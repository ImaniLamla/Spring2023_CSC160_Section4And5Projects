package zoo.animal;

public class FlyingFish extends Fish implements Fly, Swim{
	
	protected final String type = "Flying Fish";

	public FlyingFish() {
		
		super();//calls parent constructor
		this.water = Water.UNKNOWN;
	}
	
	public <T> FlyingFish (T birthdate, float weight) throws Exception{
		
		super(birthdate, weight);
	}
	
	public <T> FlyingFish (T birthdate, float weight, T water) throws Exception{
		
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

	@Override
	public void fly() {
		System.out.println("This " + this.type + " is flying.");
		
	}

	@Override
	public void soar() {
		System.out.println("This " + this.type + " is soaring.");
		
	}

}
