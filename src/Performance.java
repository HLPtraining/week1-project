import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Performance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		//create an audition class to hold the audition
		Audition theAudition = new Audition();
		
		String performance_status = "";
		int performer = 0;
		
		System.out.print("Your show starts soon! would you like to add performers that will be auditioning? Type 'yes' to start adding, type any other key to exit");
		performance_status = input.nextLine();
		
		System.out.println(performance_status);
		if(performance_status.equals("yes"))
		{
			System.out.println("You must add 4 performers, 2 dancers and 1 Vocalist");
			
			while (theAudition.getCapacity() != "full")
			{
				System.out.printf("Please select what type of performer to add:  Press 1 for performer, 2 for dancer, 3 for vocalist, 4 to display current Audition");
				performer = input.nextInt();
				switch (performer)
				{
					case 1: // performer
						theAudition.addPerformer();
					break;
					
					case 2: // dancer
						theAudition.addDancer();
					break;
					
					case 3: // vocalist
						theAudition.addVocalist();	
					break;
					case 4: //display list
						theAudition.displayPerformers();
						break;
					default:
						System.out.printf("Selection does not match option %n");
					break;
				}
				
			}
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			theAudition.startShow();
		
		
		}
		else
		{
			System.out.println("You will have to add performers soon!");
		}
		
	}

}
