import java.awt.event.ActionEvent;


public class CalcUT {
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
