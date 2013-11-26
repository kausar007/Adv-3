
public class RunDogBots {

	
	public static void main(String[] args) {
		
		DogBot rover = new DogBot("Rover", 3, 2);
		DogBot patch = new DogBot("Patch", 2, 3);
		
		RacingDogBot spot = new RacingDogBot("Spot", 2, 1);
		
		DogWatcher henry = new DogWatcher("Henry");
		DogWatcher mike = new DogWatcher("Mike");
		
		rover.addObserver(henry);
		rover.addObserver(mike);
		
		System.out.println("Activities of Rover with two observers\n");
		
		rover.play();
		rover.rest();
		rover.eat();
		rover.noise();
		
		System.out.println("\n-----------------------\n");
		
		patch.addObserver(henry);
		
		System.out.println("Activities of Patch with observer Henry\n");
		
		patch.play();
		patch.eat();
		patch.noise();
		
		System.out.println("\n-----------------------\n");
		System.out.println("REMOVING OBSERVER HENRY FROM ROVER\n");
		
		rover.deleteObserver(henry);
		
		System.out.println("Activities of Rover after observer Henry removed\n");
		
		rover.play();
		rover.eat();
		rover.noise();
		
		
		System.out.println("\n-----------------------\n");
		
		spot.addObserver(mike);
		
		System.out.println("Activities of RacingDogBot Spot with observer Mike\n");
		
		spot.play();
		spot.rest();
		spot.race();
		spot.eat();
		
		}
}
