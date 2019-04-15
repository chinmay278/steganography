package steganography;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
class UtilityOperations
{
 public static JPanel createBorderedPanel
        (JPanel panel, String title, int hPad, int vPad)
 {
  int i;
  char chars[]= new char[hPad];
  for(i=0; i<chars.length; i++) chars[i]= ' ';
  String hString= new String(chars);
  chars= new char[vPad];
  for(i=0; i<chars.length; i++) chars[i]= ' ';
  String vString= new String(chars);
  JPanel newPanel= new JPanel();
  newPanel.setLayout(new BorderLayout());
  newPanel.add(panel, BorderLayout.CENTER);
  newPanel.add(new JLabel(vString), BorderLayout.NORTH);
  newPanel.add(new JLabel(vString), BorderLayout.SOUTH);
  newPanel.add(new JLabel(hString), BorderLayout.EAST);
  newPanel.add(new JLabel(hString), BorderLayout.WEST);
  newPanel.setBorder(new TitledBorder(title));
  newPanel.setBackground(panel.getBackground());
  newPanel.setForeground(panel.getForeground());
  return newPanel;
 }
 public static JPanel createBorderedPanel(JPanel panel,
         int hPad, int vPad)
 {
  int i;
  char chars[]= new char[hPad];
  for(i=0; i<chars.length; i++) chars[i]= ' ';
  String hString= new String(chars);
  chars= new char[vPad];
  for(i=0; i<chars.length; i++) chars[i]= ' ';
  String vString= new String(chars);
  JPanel newPanel= new JPanel();
  newPanel.setLayout(new BorderLayout());
  newPanel.add(panel, BorderLayout.CENTER);
  newPanel.add(new JLabel(vString), BorderLayout.NORTH);
  newPanel.add(new JLabel(vString), BorderLayout.SOUTH);
  newPanel.add(new JLabel(hString), BorderLayout.EAST);
  newPanel.add(new JLabel(hString), BorderLayout.WEST);
  return newPanel;
 }
}