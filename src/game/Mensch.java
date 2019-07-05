package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * ACHTUNG DAS IST NUR COPY PASTERINO
 */
public class Mensch extends Spieler {

	static int spielerAnzahl = 1;

	static String readString() {
		String Eingabe = new String();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					System.in));
			Eingabe = in.readLine();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		return Eingabe;
	}

	public Mensch() {
		super();
		
		this.name = readString();
		spielerAnzahl++;
	}

	public void weiter() {
		System.out.println("weiter?");
		readString();
	}

	public int fragen() {
		int i = 0;
		boolean ok = true;
		String x = "Ungueltige Figur! Zahl zwischen 1 und 4 eingeben!";

		do {
			ok = true;

			try {
				i = Integer.parseInt(readString());
			} catch (Exception ex) {
				ok = false;
			}

			if (i > 0 && i < 5) {
				ok = true;
			} else {
				ok = false;
				System.out.println(x);
			}

		} while (ok == false);

		return i;

	}
}