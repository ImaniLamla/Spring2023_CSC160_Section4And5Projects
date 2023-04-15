package zoo.animal;

public abstract class Fish extends Animal{
	
	protected Water water;
	
	protected final String type = "Fish";

	public Fish() {
		
		super();//calls parent constructor
		this.water = Water.UNKNOWN;
	}
	
	public <T> Fish (T birthdate, float weight) throws Exception{
		
		super(birthdate, weight);
	}
	
	public <T> Fish (T birthdate, float weight, T water) throws Exception{
		
		super(birthdate, weight);
		this.setWater(water);
	}
	
	public Water getWater() {
		return this.water;
	}
	
	public <T> void setWater(T water) throws Exception{
		
		if (water instanceof String) {
			String s = (String) water;
			
			s = s.toLowerCase();
			
			switch (s) {
			case "f":
			case "fresh":
				this.water = Water.FRESH;
				break;
			case "s":
			case "salt":
				this.water = Water.SALT;
				break;
			default:
				this.water = Water.UNKNOWN;
			}
		}
		else if (water instanceof Water) {
			this.water = (Water) water;
		}
		else {
			throw new Exception("Invalid water type: " + water);
		}
	}
	
	@Override 
	public String toString() {
		
		return this.id + " " + this.type;
	}

}
