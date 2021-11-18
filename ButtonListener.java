import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

//add code to constructor that uses metric as an incoming string

class ButtonListener implements ActionListener
{
   private Measurable[] objects;
   private String metric;

	public ButtonListener(Measurable[] objects, String metric)
	{
		this.objects = objects;
		this.metric = metric;
	}

	public void actionPerformed(ActionEvent event)
	{
		double result = 0;

		if(metric == "Max");
		{
			result = Data.max(objects);
		}
		if(metric == "Min")
		{
			result = Data.min(objects);
		}
		if(metric == "Avg")
		{
			result = Data.average(objects);
		}
		if(objects[0].getClass().getName().equals("BankAccount"))
		{
			System.out.println(metric + " Account Balance is " + result);
		}
		if(objects[0].getClass().getName().equals("Country"))
		{
			System.out.println(metric + " Country Area is "+result);
		}
				
	}

//put code here that will calculate using Data.max or Data.min or Data.average depending on the metric being requested in viewer   
}
