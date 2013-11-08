import javax.swing.*;
import java.awt.*;
public class GUIWindow 
{
	public static void main(String[] args)
	{
		JFrame theGUI = new JFrame();
		theGUI.setTitle("Frame with 2x2 different Colored panels");
		theGUI.setSize(300,200);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel Panel_1 = new JPanel();
		Panel_1.setBackground(Color.green);
		JPanel Panel_2 = new JPanel();
		Panel_2.setBackground(Color.blue);
		JPanel Panel_3 = new JPanel();
		Panel_3.setBackground(Color.red);
		JPanel Panel_4 = new JPanel();
		Panel_4.setBackground(Color.yellow);
		Container pane = theGUI.getContentPane(); //the window
		pane.setLayout(new GridLayout(2,2));
		pane.add(Panel_1);//add all panels
		pane.add(Panel_2);
		pane.add(Panel_3);
		pane.add(Panel_4);
		theGUI.setVisible(true);//see
	}//end public main
}//end class GUIWindow
