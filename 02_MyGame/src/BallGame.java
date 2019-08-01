import java.awt.*;
import javax.swing.*;

/**
 * BallGame https://www.bilibili.com/video/av59529105/?p=22
 */
public class BallGame extends JFrame {

    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");

    double x = 100;
    double y = 100;
    double dx = 4;
    boolean right = true;

    public void paint(Graphics g) {
        System.out.println("重画一次");
        g.drawImage(desk, 10, 40, null);
        g.drawImage(ball, (int) x, (int) y, null);

        if (right) {
            x += dx;
        } else {
            x -= dx;
        }

        if (x > 850) {
            right = false;
            x=850;
        }

        if (x < 20) {
            right = true;
            x = 20;
        }
    }

    void launchFrame() {
        setSize(900, 530);
        setLocation(200, 200);
        setVisible(true);

        while (true) {
            repaint();
            try {
                Thread.sleep(17);

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