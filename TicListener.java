import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TicListener implements ActionListener
{
  public void actionPerformed(ActionEvent evt)
  {
	JButton bc=(JButton)evt.getSource();
	if(bc.getIcon()!=null || Va.winner)
	  return;
	if(Va.user==1)
	{
	  bc.setIcon(Va.icon1);
	  Va.msg.setText("Second Player Turn..");
	  Va.msg.setForeground(Color.yellow);
	  Va.user=2;
	  Va.player="First";
	  DeclareWinner.findWinner(Va.icon1);
	}
	else if(Va.user==2)
	{
	  bc.setIcon(Va.icon2);
	  Va.msg.setText("First Player Turn..");
	  Va.msg.setForeground(Color.blue);
	  Va.user=1;
	  Va.player="Second";
	  DeclareWinner.findWinner(Va.icon2);
	}
	Va.count++;
	if(Va.count==9 && !Va.winner)
	{
	  Va.msg.setText("it's a tie..");
	  Va.msg.setForeground(Color.red);
	  Va.reset.setEnabled(true);
	}
  }
}
