import java.util.*;

class DogWatcher implements Observer
{
	private String name;
	
	public DogWatcher(String n)
	{
		name = n;
	}
	
	public void update(Observable obj, Object arg) {
		
		System.out.println(name + " observes " + obj.toString() +  " " + arg.toString() );
		
	}

}
