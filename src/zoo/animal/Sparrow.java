package zoo.animal;

public class Sparrow extends Bird implements Fly{
	
	protected final String type = "Sparrow";

	public Sparrow() {
		
		super();//calls parent constructor
		this.wingspan = 0;
	}
	
	public <T> Sparrow (T birthdate, float weight) throws Exception{
		
		super(birthdate, weight);
	}
	
	public <T> Sparrow (T birthdate, float weight, float wingspan) throws Exception{
		
		super(birthdate, weight, wingspan);
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
	public void fly() {
		System.out.println("This " + this.type + " is flying.");
		
	}

	@Override
	public void soar() {
		System.out.println("This " + this.type + " is soaring.");
		
	}

}
