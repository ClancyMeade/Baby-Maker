import java.util.ArrayList; 

public class BabyMakerMain
	{

		public static void main(String[] args)
			{
				ArrayList <Baby> nursery = new ArrayList <Baby>(); 
				
				nursery.add(new Baby("male", 6.2, "Fred")); 
				nursery.add(new Baby("male", 7.3, "Jimmy")); 
				nursery.add(new Baby("female", 8.1, "Dorothy")); 
				
				nursery.get(1).setGender("female");
				
				System.out.println(nursery.get(1).getGender()); 
				
		
				
			
				for(Baby b : nursery)
					{
						System.out.println(b.getName());
					}

			}

	}
