public class Vocalist extends Performer {
	
	private String key;
	private int volume;
	String[] Keys = {"C#", "F#", "G#", "G", "Am", "Bm"};
	
	public Vocalist(String performerType)
	{
		super(performerType);
		this.key = Keys[0 + randomId.nextInt(6)];				
		this.volume = 1 + randomId.nextInt(10);
	}
	
	public Vocalist(String performerType, String key, int volume)
	{
		super(performerType);
		this.key = key;				
		this.volume = volume;
	}

	public void setVolume(int volume)
	{
		this.volume = volume;
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	public void setKey(String key)
	{
		this.key = key;
	}
	
	public String getKey()
	{
		return key;
	}
}
