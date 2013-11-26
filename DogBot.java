import java.util.Observable;

public class DogBot extends Observable
{

	protected String name;
	protected int hungry,tired;

	public DogBot(String n, int h,int l)
	{
		name = n;
		hungry=h;
		tired=l;
	}


	public boolean eat()
	{
		if(hungry>6)
		{
			hungry-=3;
			setChanged();
			notifyObservers("eat");
			return true;
		}
		else
			return false;
	}

	public void rest()
	{
		hungry++;
		tired-=2;
		setChanged();
		notifyObservers("rest");
	}

	public void play()
	{
		hungry+=2;
		tired+=3;
		setChanged();
		notifyObservers("play");
	}

	public String noise()
	{
		
		if(hungry > 8&& tired< 11)
			return "whine ";
		else if(tired> 7 && tired>hungry)
			return  "snore ";
		else
			return "woof ";
		
	}

	@Override
	public String toString() {
		return name;
	}
	
	

}