import java.security.SecureRandom;


public class Performer {
	
	private final int id;
	private String performerType;
	protected SecureRandom randomId = new SecureRandom();
	
	//class constructor
	public Performer(String performerType)
	{
		
		this.id = 1 + randomId.nextInt(1000 - 1);
		this.performerType = performerType;
	}
	
	public int getId()
	{
		return id;
	}
	
	
	public void setPerformerType(String performerType)
	{
		this.performerType = performerType;
	}
	
	public String getPerformerType()
	{
		return performerType;
	}
}
