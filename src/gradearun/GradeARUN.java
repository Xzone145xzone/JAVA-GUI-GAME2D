
package gradearun;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JFrame;

import java.io.IOException;
import javax.imageio.ImageIO;

class JFramenaja extends JFrame {

    BufferedImage image;

    JFramenaja() throws IOException {

        this.image = ImageIO.read(new File(".\\src\\resources\\A.png"));
        this.setSize(550, 340);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.add(new StartGame());
        this.setTitle("GradeA RUN!!!");
        this.setIconImage(image);
    }

}

public class GradeARUN {

    public static void main(String[] args) throws IOException {

        new JFramenaja();

    }

}
