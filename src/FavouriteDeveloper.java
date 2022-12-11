import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FavouriteDeveloper {
	public static void main(String[] args) {
		ImageIcon icon = new ImageIcon("src/bild.jpg");
		JOptionPane.showMessageDialog(null, "Dily!", "Favourite Developer", JOptionPane.INFORMATION_MESSAGE, icon);
		System.out.println("Dily!") ;
	}
}