package zoo.animal;

public abstract class Bird extends Animal{
	
	protected float wingspan;
	
	protected final String type = "Bird";

	public Bird() {
		
		super();//calls parent constructor
		this.wingspan = 0;
	}
	
	public <T> Bird (T birthdate, float weight) throws Exception{
		
		super(birthdate, weight);
	}
	
	public <T> Bird (T birthdate, float weight, float wingspan) throws Exception{
		
		super(birthdate, weight);
		this.setWingspan(wingspan);
	}

	/**
	 * @return the wingspan
	 */
	public float getWingspan() {
		return wingspan;
	}

	/**
	 * @param wingspan the wingspan to set
	 */
	public void setWingspan(float wingspan) throws Exception{
		
		if (wingspan > 0)
			this.wingspan = wingspan;
		else 
			throw new Exception("Invalid wingspan: " + wingspan);
	}
	
	@Override 
	public String toString() {
		
		return this.id + " " + this.type;
	}
	
	

}
