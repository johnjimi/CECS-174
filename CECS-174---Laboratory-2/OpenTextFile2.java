import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.*;
import java.util.*;
import java.io.*;
class OpenTextFile2
{
	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		JOptionPane myWindow;
		myWindow = new JOptionPane();
		String fileName;
		fileName=myWindow.showInputDialog("Enter External Text File to Open;");
		Scanner scanner = new Scanner(new File(fileName));
		JTextArea outputOriginalFile = new JTextArea();
		outputOriginalFile.setText("The Original File was:\n");
		JTextArea outputTextArea = new JTextArea();
		while (scanner.hasNext())
		{
			String fullName=scanner.nextLine();
			outputOriginalFile.append(fullName+"\n");
			
		}
		myWindow.showMessageDialog(null,outputOriginalFile, "Opened file....",myWindow.INFORMATION_MESSAGE);
		
		PrintWriter pw=new PrintWriter(new File("outputOfFile.txt"));
		String firstName, middleName, lastName;
		JTextArea outputTextArea1 = new JTextArea();
		outputTextArea1.setText("The Modified Text File is:\n");
		Scanner scanner2 = new Scanner(new File(fileName));
		while (scanner2.hasNext())
		{
			String fullName=scanner2.nextLine();
			StringTokenizer st = new StringTokenizer(fullName," ");
			firstName=st.nextToken();
			middleName=st.nextToken();
			lastName=st.nextToken();
			pw.println(lastName+", "+firstName+" "+middleName.substring(0,1)+".");
			outputTextArea1.append(lastName+", "+firstName+" "+middleName.substring(0,1)+"."+"\n");
		}
		myWindow.showMessageDialog(null, outputTextArea1, "Results....",myWindow.INFORMATION_MESSAGE);
		
		scanner.close();
		scanner2.close();
		pw.close();
	}
}
//Problem 6 Lab 2
