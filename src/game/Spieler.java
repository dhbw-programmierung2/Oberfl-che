package game;

public abstract class Spieler {

	String name;

	RollTheDice a;

	public Spieler() {
		a = new RollTheDice();
	}

	public int wuerfeln(){
		return(a.rollTheDice());
	}
	
	abstract public void weiter();
	abstract public int fragen();
	
}