import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BandeiraBrasil extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(8, 156, 59));
        g.fillRect(30, 30, 1140, 740);

        g.setColor(new Color(255, 223, 0));
        int[] xPoints = {600, 100, 600, 1100};
        int[] yPoints = {100, 415, 730, 415};
        g.fillPolygon(xPoints, yPoints, 4);

        g.setColor(new Color(0, 39, 102));
        int circleDiameter = 350;
        int circleX = 600 - circleDiameter / 2;
        int circleY = 415 - circleDiameter / 2;
        g.fillOval(circleX, circleY, circleDiameter, circleDiameter);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bandeira do Brasil");
        BandeiraBrasil bandeira = new BandeiraBrasil();
        frame.add(bandeira);
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
