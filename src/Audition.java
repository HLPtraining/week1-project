import java.util.ArrayList;
import java.util.Scanner;
public class Audition {
	
	private ArrayList<Performer> performers; //array of performers
	private final int AUDITION_MAX = 7; 
	private final int MAX_PERFORMERS = 4; 
	private final int MAX_DANCERS = 2; 
	private final int MAX_VOCALISTS = 1; 
	
	private String capacity;
	private Scanner input = new Scanner(System.in);
	
	public Audition()
	{
		performers = new ArrayList<Performer>();
		capacity = "";
	}
	
	public void addPerformer()
	{
		
		if(performers.size() >= AUDITION_MAX)
		{
			capacity = "full";
			System.out.printf("There are already a maximum number of persons auditioning : %d%n "
					+ "Your Auditions performance will start shortly! %n", performers.size() );
		}
		else
		{
			if(countPerformers() >= MAX_PERFORMERS)
			{
				System.out.printf("There are already a maximum number of performers :%d%n",countPerformers() );
			}
			else
			{
			performers.add(new Performer("Performer"));
			System.out.printf("added Performer%n" );
			}
		}
	}
	
	public void addVocalist()
	{
		if(performers.size() >= AUDITION_MAX)
		{
			capacity = "full";
			System.out.printf("There are already a maximum number of performers : %d%n "
					+ "Your Auditions performance will start shortly! %n", performers.size() );
		}
		else
		{
			if(countVocalists() >= MAX_VOCALISTS)
			{
				System.out.printf("There are already a maximum number of Vocalists which is %d%n", countVocalists());
			}
			else
			{
				performers.add(new Vocalist("Vocalist"));
				System.out.printf("added Vocalist%n" );
			}
		}
	}
	
	public void addDancer()
	{
		if(performers.size() >= AUDITION_MAX)
		{
			capacity = "full";
			System.out.printf("There are already a maximum number of performers : %d%n "
					+ "Your Auditions performance will start shortly! %n", performers.size() );
		}
		else
		{
			if(countDancers() >= MAX_DANCERS)
			{
				System.out.printf("There are already a maximum number of Dancers which is %d%n", countDancers());
			}
			else
			{
				performers.add(new Dancer("Dancer"));
				System.out.printf("added Dancer%n" );
			}
		}
		
	}
	
	public void displayPerformers()
	{
		for (Performer member: this.performers)
		{
			System.out.printf("I am %s ", member.getPerformerType());
			System.out.println(member.getId());
			
		}
	}
	
	public int countPerformers()
	{
		int count = 0;
		for(Performer member: this.performers)
		{
			if(member.getPerformerType() == "Performer")
			{
				count++;
			}
			
		}
		return count;
	}
	
	public int countDancers()
	{
		int count = 0;
		for(Performer member: this.performers)
		{
			if(member.getPerformerType() == "Dancer")
			{
				count++;
			}
			
		}
		return count;
	}
	
	public int countVocalists()
	{
		int count = 0;
		for(Performer member: this.performers)
		{
			if(member.getPerformerType() == "Vocalist")
			{
				count++;
			}
			
		}
		return count;
	}
	
	public String getCapacity()
	{
		return capacity;
	}
	
	public void startShow()
	{
		String theInput = "";
		for (Performer member: this.performers)
		{
			if(member.getPerformerType() == "Vocalist")
			{
				System.out.print("Would you like to change the vocalist volume? Press 1 for yes or type another key for no");
				theInput = input.next();
				if(theInput.contentEquals("1"))
				{
					System.out.print("Type volume level from 1 to 10");
					((Vocalist) member).setVolume(input.nextInt());
					
					System.out.printf("I sing in the key of - %s - at the volume %d - %d%n ", ((Vocalist) member).getKey(),((Vocalist) member).getVolume(), ((Vocalist) member).getId());
				}
				else
				{
					System.out.printf("I sing in the key of - %s - %d ", ((Vocalist) member).getKey(), ((Vocalist) member).getId() );
				}	
			}
			else if(member.getPerformerType() == "Dancer")
			{
				System.out.printf("%s - %d - %s%n ", ((Dancer) member).getDanceStyle(), ((Dancer) member).getId(), ((Dancer) member).getPerformerType());
			}
			else if(member.getPerformerType() == "Performer")
			{
				System.out.printf("%d - %s%n ", member.getId(), member.getPerformerType());
			}
		}
		
	}
}
