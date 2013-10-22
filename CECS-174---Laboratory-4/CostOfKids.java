//Assignment 4-2 
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.text.*;//for Money $$
public class CostOfKids extends Applet implements ActionListener /*ActionPerformed*/ {

	public Button Jamie = new Button("Jamie");
	public Button Joey = new Button("Joey");
	public Button Jared = new Button("Jared");
	public Button Jody = new Button("Jody");
	public Button Total = new Button("Total");
	public TextField text = new TextField(5);
	public Label answer = new Label("");
	public Label Jamieanswer = new Label("");
	public Label Joeyanswer = new Label("");
	public Label Jaredanswer = new Label("");
	public Label Jodyanswer = new Label("");
	double JamieSum = 0.0;
	double JoeySum = 0.0;
	double JaredSum = 0.0;
	double JodySum = 0.0;
	double TotalForAll = 0.0;
	DecimalFormat df =  new DecimalFormat("0.00"); //round up
	//main
	public void init() 
	{
		add(Jamie);
		add(Joey);
		add(Jared);
		add(Jody);
		add(Total);//active
		add(text);//text boxs
		add(answer);
		add(Jamieanswer);
		add(Joeyanswer);
		add(Jaredanswer);
		add(Jodyanswer);
		Jamie.addActionListener(this);//"this" window
		Joey.addActionListener(this);
		Jared.addActionListener(this);
		Jody.addActionListener(this);
		Total.addActionListener(this);
		text.addActionListener(this);
	}// end public void init()
	
	public void actionPerformed(ActionEvent event)
	{
		Object source = event.getSource();
		if(source == Jamie)
		{
			double money1 = new Double(text.getText()).doubleValue();
			TotalForAll = TotalForAll + money1;
			JamieSum = JamieSum + money1;
			text.setText("");
		}// end if source == jamie
		else 
		if (source == Joey)
		{
			double money2 = new Double(text.getText()).doubleValue();
			TotalForAll = TotalForAll + money2;
			JoeySum = JoeySum + money2;
			text.setText("");
		}// end else if source == Joey
		else 
		if (source == Jared)
			{
				double money3 = new Double(text.getText()).doubleValue();
				TotalForAll = TotalForAll + money3;
				JaredSum = JaredSum + money3;
				text.setText("");
			}//end else if source == jared
		else 
		if (source == Jody)
			{
				double money4 = new Double(text.getText()).doubleValue();
				TotalForAll = TotalForAll + money4;
				JodySum = JodySum + money4;
				text.setText("");
			}// end else if source == jody
		else 
		if (source == Total)
		{
			answer.setText("Total  = " + "$" + df.format(TotalForAll));
			Jamieanswer.setText("Jamie = " + df.format(JamieSum));
			Joeyanswer.setText("Joey = " + "$" + df.format(JoeySum));
			Jaredanswer.setText("Jared = " + "$" + df.format(JaredSum));
			Jodyanswer.setText("Jody = " + "$" + df.format(JodySum));
		}//end else if source == total
	}//end actionperformed
}//end class CostOfKids
//WOLOLO
