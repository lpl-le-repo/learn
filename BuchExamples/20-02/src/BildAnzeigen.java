import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class BildAnzeigen {

  public static void main(String args[]) {
    new MeinFrame();
  }
}


class MeinFrame extends JFrame {
  
  	private static final long serialVersionUID = 1L;


MeinFrame() {
    ImageIcon icon = new ImageIcon("javabuch.jpg");
    JLabel beschriftung = new JLabel(icon);
    add(beschriftung);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 //   pack();
    setVisible(true);
  }
}
