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
	 * FelderArrays bef�llen
	 */

	private int zufallsZahl()
	{
		// Erzeugen eines Random Objekts
		Random rnd = new Random();
		
		//Value bekommt eine zuf�llige Zahl zwischen 1 und  zugewiesen
		int value = rnd.nextInt(5) + 1;
		
		return value;
	}
		
	
	/**
	* Simuliert einen W�rfelwurf
	*/
	public void wurf()
	{
		if (wurf == 0) { 
		
		// Der variablen Wurf die gew�rfelte Augenzahl zur�ckgeben
		wurf = zufallsZahl(); 
		
		zaehler++;
		versuche++;
		
		}
	}
	
	/**
	* Den W�rfel auf 0 setzen
	*/
	public void wurfZuruecksetzen()
	{
		wurf = 0;
	}
	/**
	* Gibt den W�rfelwert zur�ck
	* 
	* @return Gibt den W�rfelwert zur�ck
	*/
	public int getWurf()
	{
		return wurf; 
	}
	
	/**
	* Gibt den W�rfelz�hler zur�ck
	* 
	* @return Gibt den W�rfelz�hler zur�ck
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
	* Anzahl der Versuche zur�ckgeben
	* 
	* @return Anzahl der Versuche
	*/
	public int getAnzahlVersuche()
	{
		return versuche; 
	}
	
	/**
	* Pr�fen ob ein Zug m�glich ist
	*/
    private void checkzug() 
    {
    	int sp = (spieleramzug); // Farbe ausw�hle
    	if (//Checken ob m�glicher Zug  false)
    	{
    		spieleramzug++;
    		if (spieleramzug == 5) spieleramzug = 1; // Korrektur, dass nach Spieler 4 Spieler 1 kommt
    		getAnzahlVersuche();
    		wurfZuruecksetzen();
    		
    		System.out.println("W�rfel wird gel�scht -> Blockiersicherung");
    	}	
    }
	
}

