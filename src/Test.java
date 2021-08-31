import java.awt.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.util.Vector; 
import javax.swing.*;

public class Test extends JFrame implements ActionListener 
{ 
	private static final long serialVersionUID = 1L;
@SuppressWarnings("unchecked")
Vector<Disc> pole[] = new Vector [3]; 
  Vector<movePole> move = new Vector<movePole>(); 
  int position = 0; 
  JPanel bottom = new JPanel(); 
  JButton prev = new JButton("<-Prev"); 
  JButton next = new JButton("Next->"); 
  JPanel center;
  
  public Test() 
  { 
    pole[0] = new Vector<Disc>();
    pole[1] = new Vector<Disc>();
    pole[2] = new Vector<Disc>();
    center = new JPanel() 
    { 

		private static final long serialVersionUID = 1L;

	@Override 
      public void paint(Graphics g) 
      { 
        Graphics2D g2 = (Graphics2D) g; 
        g.clearRect(0, 0, getWidth(), getHeight()); 
        g2.setStroke(new BasicStroke(5.0f)); 
        g2.drawLine(50, 400, 250, 400); 
        g2.drawLine(300, 400, 500, 400); 
        g2.drawLine(550, 400, 750, 400); 
        g2.drawLine(150, 200, 150, 400); 
        g2.drawLine(400, 200, 400, 400); 
        g2.drawLine(650, 200, 650, 400); 
        for (int i = 0; i < pole[0].size(); i++) 
        { 
          Disc d = pole[0].get(i); 
          g.setColor(d.c); 
          g.fillRect(150 - d.size / 2, 400 - (i * 10 + 10) - 2, d.size, 10); 
       } 
       for (int i = 0; i < pole[1].size(); i++) 
       { 
         Disc d = pole[1].get(i); 
         g.setColor(d.c); 
         g.fillRect(400 - d.size / 2, 400 - (i * 10 + 10) - 2, d.size, 10); 
      } 
      for (int i = 0; i < pole[2].size(); i++) 
      { 
        Disc d = pole[2].get(i); 
        g.setColor(d.c); 
        g.fillRect(650 - d.size / 2, 400 - (i * 10 + 10) - 2, d.size, 10); 
     } 
  } 
};

this.add(center, BorderLayout.CENTER); 
bottom.add(prev); 
bottom.add(next); 
this.add(bottom, BorderLayout.SOUTH); 
this.setSize(800, 500); 
this.setVisible(true); 
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
prev.addActionListener(this); 
next.addActionListener(this); 
Disc d = new Disc(Color.ORANGE, 100); 
pole[0].add(d); 
d = new Disc(Color.BLUE, 80); 
pole[0].add(d); 
d = new Disc(Color.RED, 60); 
pole[0].add(d); 
d = new Disc(Color.MAGENTA, 40); 
pole[0].add(d); 
d = new Disc(Color.GREEN, 20); 
pole[0].add(d); 
hanoi(5, 1, 2, 3); 
}
  
@Override 
public void actionPerformed(ActionEvent e) 
{ 
  if (e.getSource() == prev) 
  { 
    if (position > 0) 
    { 
      position--;
      movePole m = move.get(position);
      int s = m.b - 1;
      int d = m.a - 1;
      pole[d].add(pole[s].get(pole[s].size()-1));
      pole[s].remove(pole[s].size()-1);
   } 
} 
if (e.getSource() == next) 
{ 
  if (position < move.size()) 
  { 
    movePole m = move.get(position);
    position++;
    int s = m.a - 1;
    int d = m.b - 1;
    pole[d].add(pole[s].get(pole[s].size()-1));
    pole[s].remove(pole[s].size()-1);
 } 
} 
repaint(); 
} 

public void hanoi(int n, int a, int b, int c)
{ 
  movePole m; 
  if (n == 1){ 
    m = new movePole(a, c); 
    move.add(m);
    }
  else 
 { 
   hanoi((n - 1), a, c, b); 
   m = new movePole(a, c); 
   move.add(m); 
   hanoi((n - 1), b, a, c);
   }
  }
}