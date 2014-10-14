	import javax.swing.*;	
	import java.awt.event.*;
	import java.awt.*;
	public class FutureValue {

	//CALCGUI Below    
	public static void main(String[] args) {
	JFrame program = new FutureValue();
	program.setTitle("Investment Value Calculator");
	program.setLocationRelativeTo(null);
	program.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	program.pack();
	program.setVisible(true);
	}
	}
	
	
	class FutureValue extends JFrame
	implements ActionListener
	{
	JButton butCalc = new JButton("Calculate");

	JLabel Amount = new JLabel("Investment Amount");
	JLabel Years = new JLabel("Years");
	JLabel Interest = new JLabel("Annual Interest Rate");
	JLabel fV = new JLabel("Future Value");
	JLabel empty = new JLabel("");

	JTextField InvT = new JTextField(30);
	JTextField yearT = new JTextField(30);
	JTextField intT = new JTextField(30);
	JTextField fVT = new JTextField(30);

	JPanel Panel;

	public FutureValue()
	{
	Panel = new JPanel();
	Panel.setLayout(new GridLayout(5, 2));
	Panel.setPreferredSize(new Dimension(400, 250));
	
	Panel.add(Amount);
	Panel.add(InvT);
	Panel.add(Years);
	Panel.add(yearT);
	Panel.add(Interest);
	Panel.add(intT);
	Panel.add(fV);
	Panel.add(fVT);
	Panel.add(empty);
	Panel.add(butCalc);
	add(Panel);
	butCalc.addActionListener(this);
	}
	
	 
	//CalcUT & CalcEngine- JUnit Testing & Business Calcs
	    @Override
	public void actionPerformed(ActionEvent e)
	{
	double investment = Double.parseDouble(txtInv.getText());
	int year = Integer.parseInt(txtYr.getText());
	double interest = Double.parseDouble(txtRt.getText());
	if(e.getSource() == btnCal)
	{
	double res = invest * Math.pow((1 + interest/100), (year));
	System.out.println((10000 *
	Math.pow((3.25 + 1),36)));
	txtRes.setText(String.valueOf(res));
	}
	}

	}

