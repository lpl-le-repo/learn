import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class BildAnzeigen {
    
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("javabuch.jpg");
        JLabel beschriftung = new JLabel(icon);
        
        frame.add(beschriftung);
        frame.setDefaultCloseOperation
                                   (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
