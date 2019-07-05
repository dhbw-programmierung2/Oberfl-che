package game;

import java.util.Random;



public class GameRules {
	
	private int wurf;
	private int zaehler;
	private int versuche;
	
	private int spieleramzug;
	
	
	Spieler sp1 = new Mensch();
	Spieler sp2 = new Mensch();
	Spieler sp3 = new Mensch();
	Spieler sp4 = new Mensch();

	Spieler sp5 = new Mensch();
	Spieler sp6 = new Mensch();
	
	/*
	 * Array der Spielfelder	
	 */
	
	// 4 spielerArray
	GameRules[] felderarrayVier = new GameRules[48];
	
	// 6 spielerArray
	GameRules[] felderarraySechs = new GameRules[66]; // Bin mir nicht sicher obs echt 66 Felder sind LOL
	

	/*
	 * FelderArrays befüllen
	 */

	private int zufallsZahl()
	{
		// Erzeugen eines Random Objekts
		Random rnd = new Random();
		
		//Value bekommt eine zufällige Zahl zwischen 1 und  zugewiesen
		int value = rnd.nextInt(5) + 1;
		
		return value;
	}
		
	
	/**
	* Simuliert einen Würfelwurf
	*/
	public void wurf()
	{
		if (wurf == 0) { 
		
		// Der variablen Wurf die gewürfelte Augenzahl zurückgeben
		wurf = zufallsZahl(); 
		
		zaehler++;
		versuche++;
		
		}
	}
	
	/**
	* Den Würfel auf 0 setzen
	*/
	public void wurfZuruecksetzen()
	{
		wurf = 0;
	}
	/**
	* Gibt den Würfelwert zurück
	* 
	* @return Gibt den Würfelwert zurück
	*/
	public int getWurf()
	{
		return wurf; 
	}
	
	/**
	* Gibt den Würfelzähler zurück
	* 
	* @return Gibt den Würfelzähler zurück
	*/
	public int getWurfzaheler()
	{
		return zaehler; 
	}
	
	/**
	* Anzahl der Versuche auf 0 setzen
	*/
	public void AnzahlVersucheGleichNull()
	{
		versuche = 0; 
	}
	
	/**
	* Anzahl der Versuche zurückgeben
	* 
	* @return Anzahl der Versuche
	*/
	public int getAnzahlVersuche()
	{
		return versuche; 
	}
	
	/**
	* Prüfen ob ein Zug möglich ist
	*/
    private void checkzug() 
    {
    	int sp = (spieleramzug); // Farbe auswähle
    	if (//Checken ob möglicher Zug  false)
    	{
    		spieleramzug++;
    		if (spieleramzug == 5) spieleramzug = 1; // Korrektur, dass nach Spieler 4 Spieler 1 kommt
    		getAnzahlVersuche();
    		wurfZuruecksetzen();
    		
    		System.out.println("Würfel wird gelöscht -> Blockiersicherung");
    	}	
    }
	
}

