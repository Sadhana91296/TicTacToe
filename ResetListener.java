import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ResetListener implements ActionListener
{
  public void actionPerformed(ActionEvent evt)
  {
    for(JButton b:Va.bt)
    {
  	b.setIcon(null);
	b.setBackground(Color.green);
    }
    Va.msg.setText("First Player Turn..");
    Va.msg.setForeground(Color.blue);
    Va.user=1;
    Va.count=0;
    Va.winner=false;
    Va.reset.setEnabled(false);
    Va.player="";	
  }
}