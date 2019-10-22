import javax.swing.*;
import java.awt.*;
class DeclareWinner
{
  static void findWinner(ImageIcon img)
  {
    if(Va.bt[0].getIcon()==img && Va.bt[1].getIcon()==img && Va.bt[2].getIcon()==img)
	announcewinner(0,1,2);
    if(Va.bt[3].getIcon()==img && Va.bt[4].getIcon()==img && Va.bt[5].getIcon()==img)
	announcewinner(3,4,5);
    if(Va.bt[6].getIcon()==img && Va.bt[7].getIcon()==img && Va.bt[8].getIcon()==img)
	announcewinner(6,7,8);
    if(Va.bt[0].getIcon()==img && Va.bt[3].getIcon()==img && Va.bt[6].getIcon()==img)
	announcewinner(0,3,6);
    if(Va.bt[1].getIcon()==img && Va.bt[4].getIcon()==img && Va.bt[7].getIcon()==img)
	announcewinner(1,4,7);
    if(Va.bt[2].getIcon()==img && Va.bt[5].getIcon()==img && Va.bt[8].getIcon()==img)
	announcewinner(2,5,8);
    if(Va.bt[0].getIcon()==img && Va.bt[4].getIcon()==img && Va.bt[8].getIcon()==img)
	announcewinner(0,4,8);
    if(Va.bt[2].getIcon()==img && Va.bt[4].getIcon()==img && Va.bt[6].getIcon()==img)
	announcewinner(2,4,6);
  }
  static void announcewinner(int i,int j,int k)
  {
    	Va.msg.setText(Va.player+" player won!!");
	Va.bt[i].setBackground(Color.gray);
	Va.bt[j].setBackground(Color.gray);
	Va.bt[k].setBackground(Color.gray);
	Va.winner=true;
	Va.reset.setEnabled(true);
  } 

}