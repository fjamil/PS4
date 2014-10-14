
public class CalcGUI {
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
}
