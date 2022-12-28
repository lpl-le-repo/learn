import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class FavouriteDeveloper {
	/**
	 *
	 * @param args
	 */

	public static void main(String[] args) {
		int priceDriving = 75, priceWorkingHour = 125, hours, result;
		hours = getValue("Anz Stunden? ", Boolean.TRUE);
		//second = getValue("Zweite Zahl? ", Boolean.TRUE);
		result = priceDriving + (hours * priceWorkingHour);

		// ImageIcon icon = new ImageIcon("src/bild.jpg");
		// JOptionPane.showMessageDialog(null, "Dily!", "Favourite Developer", JOptionPane.INFORMATION_MESSAGE, icon);
		// System.out.println("Dily!");
		// System.out.println(System.getProperty("java.version"));
		// Initialize keyboard objaect from class scanner
		// printout the input from keyboard
		// System.out.println(keyboard.next());
		// System.out.println(keyboard.next());
		// System.out.println(keyboard.nextLine());
		//System.out.println(keyboard.findWithinHorizon("a",0).charAt(0));
		// System.out.println("Schokolade \nHonorare\nSchlafen");
		System.out.println("Die Kosten für " + hours + " Stunden sind: " + result);

	}

	public static int getValue(String typeOfValue, Boolean lastRun) {
		int value;
		Scanner keyboard = new Scanner(System.in);
		System.out.print(typeOfValue);
		value = keyboard.nextInt() ;
		if(lastRun){
			keyboard.close();
		}
		return value;
	}
}