import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Random;
public class OddEvenOrZeroInJTextArea {
	public static void main(String[] args) {
	 int i;
	 int num;
	 Random rand = new Random();
	 JTextArea outputString = new JTextArea();
	 outputString.setText("i-value"+"\t"+"Number"+"\t"+"Type."+"\n");
		for (i=1;i<20;i++)
		{
		outputString.append(i+"."+"\t");
	num = rand.nextInt(21);
	if(num==0)
		outputString.append(num+"\t"+"is Zero "+"\n");
	else if (num%2==0)
		outputString.append(num+"\t"+"is Even "+"\n");
	else
		outputString.append(num+"\t"+"is Odd "+"\n");
		}
		JOptionPane.showMessageDialog(null,outputString,
	"If Conditional's Demo." ,JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
	}
}
