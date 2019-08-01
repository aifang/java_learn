import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * BallGame https://www.bilibili.com/video/av59529105/?p=22
 */
public class BallGame2 extends JFrame {

    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");

    double x = 100;
    double y = 100;
    double dx = 10;
    double degree = 3.14 / 3;// 60度

    public void paint(Graphics g) {
        // System.out.println("重画一次");
        g.drawImage(desk, 10, 40, null);
        g.drawImage(ball, (int) x, (int) y, null);

        x += dx * Math.cos(degree);
        y += dx * Math.sin(degree);

        if (y > 480 || y < 50) {
            degree = -degree;
        }

        if (x > 850 || x < 20) {
            degree = 3.14 - degree;

        }

    }

    void launchFrame() {
        setSize(900, 530);
        setLocation(200, 200);
        setVisible(true);
        Timer timer = new Timer(20, evt -> repaint());
        timer.start();

        // while (true) {
        //     repaint();
        //     try {
        //         Thread.sleep(17);

        //     } catch (Exception e) {
        //         e.printStackTrace();
        //     }
        // }
    }

    public static void main(String[] args) {
        System.out.println("start game");
        BallGame2 game = new BallGame2();
        game.launchFrame();
    }

}