import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
class MainClass extends JFrame
{
	JLabel la=new JLabel(new ImageIcon(getClass().getResource("images/t2.jpg")));
	JPanel []pa=new JPanel[3];
	public MainClass()
	{
		super("TicTacToe");
		setSize(600,640);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setResizable(false);
		Va.icon1=new ImageIcon(getClass().getResource("images/user1.png"));
		Va.icon2=new ImageIcon(getClass().getResource("images/user2.png"));
		add(la);
		addPanels();
		setVisible(true);
	}
	private void addPanels()
	{
		la.setLayout(null);
		for(int i=0;i<3;i++)
		{
			pa[i]=new JPanel();
			la.add(pa[i]);
		}
		pa[0].setBounds(100,30,400,40);
		pa[1].setBounds(100,100,400,400);
		pa[2].setBounds(100,530,400,40);
		addInfo();
		addButtons();
	}
	private void addInfo()
	{
		pa[0].add(Va.msg);
		Va.msg.setFont(new Font("elephant",0,25));
		Va.msg.setForeground(Color.blue);
		pa[2].add(Va.reset);
		pa[2].setOpaque(false);
		Va.reset.setFont(new Font("arial",0,20));
		Va.reset.addActionListener(new ResetListener());
		Va.reset.setEnabled(false);
	}
	private void addButtons()
	{
		Border b=BorderFactory.createLineBorder(Color.red,3);
		pa[1].setBorder(b);
		pa[1].setLayout(new GridLayout(3,3));
		TicListener li=new TicListener();
		for(int i=0;i<9;i++)
		{
			Va.bt[i]=new JButton();
			Va.bt[i].addActionListener(li);
			Va.bt[i].setBackground(Color.green);
			Va.bt[i].setBorder(b);
			pa[1].add(Va.bt[i]);
		}
	}
	public static void main(String []args)
	{
		setDefaultLookAndFeelDecorated(true);
		new MainClass();
	}
}
