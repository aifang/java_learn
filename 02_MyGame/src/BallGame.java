import java.awt.*;
import javax.swing.*;

/**
 * BallGame
 */
public class BallGame extends JFrame {

    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");

    double x = 100;
    double y = 100;

    public void paint(Graphics g) {
        System.out.println("重画一次");
        g.drawImage(desk, 10, 40, null);
        g.drawImage(ball, (int) x, (int) y, null);

        if (x > 704) {
            x -= 10;

        }
        if (x < 4) {
            x += 10;
        }
    }

    void launchFrame() {
        setSize(710, 390);
        setLocation(200, 200);
        setVisible(true);

        while (true) {
            repaint();
            try {
                Thread.sleep(40);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("start game");
        BallGame game = new BallGame();
        game.launchFrame();
    }

}