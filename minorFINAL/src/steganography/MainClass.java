package steganography;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass extends WindowAdapter implements ActionListener
{
    private JFrame          mainFrame;
    private JMenuBar        menuBar;
    private JMenu           menuFile, menuHelp;
    private JMenuItem       mnuExit, mnuEmbedMessage, mnuEmbedFile, 
                            mnuHelp;
    private JMenuItem       mnuRetrieveMessage, mnuRetrieveFile;
    private JPanel          mainPanel, panelButtons;
    private JLabel          lblLogo;
    private JButton         btnEmbedFile, btnRetrieveFile,
                            btnEmbedMessage, btnRetrieveMessage;
    private JButton         btnHelp,btnExit;
    private Handler  back;


 public MainClass()
        {
  mainFrame= new JFrame("Steganograph");
  mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  mainFrame.addWindowListener(this);
  lblLogo=new JLabel(new ImageIcon("C:\\Users\\MAX\\Documents\\"
          + "NetBeansProjects\\minorFINAL\\src\\steganography"
          + "\\stego.gif"));

		mnuExit= new JMenuItem("Exit", 'x');
		mnuEmbedMessage= new JMenuItem("Embed Message",  'e');
		mnuEmbedFile= new JMenuItem("Embed File",  'f');
		mnuRetrieveMessage= new JMenuItem("Retrieve Message", 'm');
		mnuRetrieveFile= new JMenuItem("Retrieve File",  'r');	
		mnuHelp= new JMenuItem("Help", 'h');
 
  mnuEmbedMessage.addActionListener(this);
  mnuEmbedFile.addActionListener(this);
  mnuRetrieveMessage.addActionListener(this);
  mnuRetrieveFile.addActionListener(this);
  mnuExit.addActionListener(this);
  mnuHelp.addActionListener(this);
  menuFile= new JMenu("File");
  menuFile.setMnemonic('i');
  menuFile.add(mnuEmbedMessage);
  menuFile.add(mnuEmbedFile);
  menuFile.add(mnuRetrieveMessage);
  menuFile.add(mnuRetrieveFile);
  menuFile.add(mnuExit);
  
  menuHelp= new JMenu("Help");
  menuHelp.setMnemonic('H');
  menuHelp.add(mnuHelp);
  menuBar= new JMenuBar();
  menuBar.add(menuFile);
  menuBar.add(menuHelp);
  mainFrame.setJMenuBar(menuBar);
 
  mainPanel= new JPanel();
  panelButtons= new JPanel();
  btnEmbedMessage= new JButton("Embed Message");
  btnEmbedMessage.setMnemonic('e');
  btnEmbedFile= new JButton("Embed file");
  btnEmbedFile.setMnemonic('f');
  btnRetrieveMessage= new JButton("Retrieve Message");
  btnRetrieveMessage.setMnemonic('m');
  btnRetrieveFile= new JButton("RetrieveFile");
  btnRetrieveFile.setMnemonic('r');
  btnHelp= new JButton("Help");
  btnHelp.setMnemonic('h');
  btnExit=new JButton("Exit");
  btnExit.setMnemonic('x');
   btnEmbedMessage.setBackground(Color.black);
  btnEmbedMessage.setForeground(Color.WHITE);
  btnEmbedFile.setBackground(Color.black);
  btnEmbedFile.setForeground(Color.WHITE);
  btnRetrieveFile.setBackground(Color.black);
  btnRetrieveFile.setForeground(Color.WHITE);
  btnRetrieveMessage.setBackground(Color.black);
  btnRetrieveMessage.setForeground(Color.WHITE);
  btnExit.setBackground(Color.black);
  btnExit.setForeground(Color.WHITE);
  btnHelp.setBackground(Color.black);
  btnHelp.setForeground(Color.WHITE);
  mainPanel.setBackground(Color.BLACK);
  
  lblLogo.setBounds(1,1,800,600);
  btnEmbedMessage.setBounds(60, 20, 140, 20);
  btnEmbedFile.setBounds(200, 20, 100, 20);
  btnRetrieveMessage.setBounds(300, 20, 140, 20);
  btnRetrieveFile.setBounds(440, 20, 100, 20);
  btnHelp.setBounds(540, 20, 100, 20);
  btnExit.setBounds(640, 20, 100, 20);
 
 
  mainFrame.add(lblLogo);
  mainFrame.add(btnEmbedMessage);
  mainFrame.add(btnEmbedFile);
  mainFrame.add(btnRetrieveMessage);
  mainFrame.add(btnRetrieveFile);
  mainFrame.add(btnHelp);
  mainFrame.add(btnExit);

  btnEmbedMessage.addActionListener(this);
  btnEmbedFile.addActionListener(this);
  btnRetrieveMessage.addActionListener(this);
  btnRetrieveFile.addActionListener(this);
  btnHelp.addActionListener(this);
  btnExit.addActionListener(this);
  JPanel tempPanel= (JPanel) mainFrame.getContentPane();
  tempPanel.add(mainPanel, BorderLayout.CENTER);
 
  tempPanel.setBackground(Color.WHITE);
  Dimension d= Toolkit.getDefaultToolkit().getScreenSize();
  mainFrame.setSize((int)(d.width-(d.width*.40)), 
          (int) (d.height-(d.height*.40)));
  mainFrame.setResizable(false);
  mainFrame.setVisible(true);
 }

 public void actionPerformed(ActionEvent e) 
        {
  Object source= e.getSource();

  if(source== mnuEmbedMessage || source== btnEmbedMessage)
  {
   back= new Handler(this, Handler.EMBED_MESSAGE);
   back.start();
  }

  if(source== mnuRetrieveMessage || source== btnRetrieveMessage)
  {
   back= new Handler(this, Handler.RETRIEVE_MESSAGE);
   back.start();
  }

  if(source== mnuEmbedFile || source== btnEmbedFile )
  {
   back= new Handler(this, Handler.EMBED_FILE);
   back.start();
  }

  if(source== mnuRetrieveFile || source== btnRetrieveFile )
  {
   back= new Handler(this, Handler.RETRIEVE_FILE);
   back.start();
  }
  if(source== mnuHelp || source== btnHelp)
   Steganograph.showHelpDialog();
  if(source== mnuExit ||  source== btnExit)
  {
   int result= JOptionPane.showConfirmDialog(mainFrame, 
           "Are you sure that you want to close Steganograph.",
           "Confirm Exit", JOptionPane.YES_NO_OPTION);
			if(result== JOptionPane.YES_OPTION)
			{
				
				System.exit(0);
			}
 
   
  }
 }


 	public static void main(String args[])
	{
            MainClass mainClient = new MainClass();
	}
}