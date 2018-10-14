import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Poracka extends JApplet implements Runnable{
    String s1 = "Почекајте...";
    String s2 = "Порачката е успешно пратена!";
    private int agol = 0, x, y, d = 0;
    @Override
    public void init() {
        setSize(700, 400);
        nitka.start();
        nitka1.start();
    }
    @Override
    public void paint(Graphics g) {
        if(d < 500){
            d++;
            x = (int)(getWidth() * 0.35);
            y = (int)(getHeight() * 0.15);
            g.setColor(Color.GRAY);
            g.fillOval(x, y, 200, 200);
            g.setColor(Color.WHITE);
            g.fillArc(x, y, 200, 200, agol, 20);
            g.fillArc(x, y, 200, 200, agol + 40, 20);
            g.fillArc(x, y, 200, 200, agol + 80, 20);
            g.fillArc(x, y, 200, 200, agol + 120, 20);
            g.fillArc(x, y, 200, 200, agol + 160, 20);
            g.fillArc(x, y, 200, 200, agol + 200, 20);
            g.fillArc(x, y, 200, 200, agol + 240, 20);
            g.fillArc(x, y, 200, 200, agol + 280, 20);
            g.fillArc(x, y, 200, 200, agol + 320, 20);
            g.setColor(Color.WHITE);
            g.fillOval(x + 20, y + 20, 160, 160);
        } else {
            nitka1.stop();
            nitka.stop();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.BLACK);
            g.drawString(s2, (int)(getWidth() * 0.35), (int)(getHeight() * 0.5));
        }
    }
    Thread nitka = new Thread(){
        @Override
        public void run() {
            while(true){
                agol += 15;
                repaint();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
                System.out.println("nitka1");
            }
        }
    };
    Thread nitka1 = new Thread(){
        @Override
        public void run() {
            while(true){
                agol += 15;
                try {
                    Thread.sleep(200);
                    Graphics g = getGraphics();
                    g.drawString(s1, (int)(getWidth() * 0.46), (int)(getHeight() * 0.77));
                } catch (InterruptedException e) {
                }
                System.out.println("nitka2");
            }
        }
    };
    @Override
    public void run() {
        
    }
}
