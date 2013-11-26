
public class RacingDogBot extends DogBot {


	public RacingDogBot(String n, int h,int l){
		super(n, h, l);
	}

	public boolean race()
	 {
	  if(tired<5)
	     {
	      hungry+=2;
	      tired+=5;
	      setChanged();
		  notifyObservers("race");
	      return true;
	     }
	  else
	     return false;
	 }

	 public void rest()
	 {
	  hungry++;
	  tired-=3;
	  setChanged();
	  notifyObservers("rest");
	 }


}
