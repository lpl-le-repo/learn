import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class FavouriteDeveloper {
	/**
	 *
	 * @param args
	 */

	public static void main(String[] args) {
		// int centi;
		// zoll = getValue("Zoll? ", Boolean.TRUE);

		int i = 10;
		System.out.println(i++);
		System.out.println(--i);
		--i;
		i--;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i--);
		System.out.println(i);

		/* int fiveFrancs = sum / 500;
		rest = sum % 500;

		int twoFrancs = rest / 200;
		rest = rest % 200;

		int oneFrancs = rest / 100;
		rest = rest % 100;

		int halfFranc = rest / 50;
		rest = rest % 50;

		int twentyRappen = rest / 20;
		rest = rest % 20;

		int tenRappen = rest / 10;
		rest = rest % 10;

		int fiveRappen = rest / 5;
		rest = rest % 5; */


		// ImageIcon icon = new ImageIcon("src/bild.jpg");
		// JOptionPane.showMessageDialog(null, "Dily!", "Favourite Developer", JOptionPane.INFORMATION_MESSAGE, icon);
		// System.out.println("Dily!");
		// System.out.println("Sie sind " + centi + " Zentimeter gross.");

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