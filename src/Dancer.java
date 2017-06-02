
public class Dancer extends Performer{
	
	private String danceStyle;
	String[] danceTypes = {"Tap", "Ballet", "Hip Hop"};
	
	public Dancer(String performerType, String danceStyle) 
	{
		super(performerType);
		// TODO Auto-generated constructor stub
		this.danceStyle = danceStyle;
	}
	
	public Dancer(String performerType) 
	{
		super(performerType);
		// TODO Auto-generated constructor stub
		this.danceStyle = danceTypes[0 + randomId.nextInt(3)]; // initialize with a random type
		System.out.println(this.danceStyle);
	}
	
	public void setDanceStyle(String danceStyle)
	{
		this.danceStyle = danceStyle;
	}
	
	public String getDanceStyle()
	{
		return danceStyle;
	}

}
