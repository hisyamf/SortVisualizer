package Package;

import javax.swing.*;
import java.awt.*;

public class main extends JPanel{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        main main = new main();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setSize(1280, 720);
        frame.add(main);

        for (int i = 0; i < main.array.length; i++) {
            main.array[i] = (int)((Math.random() * 380) + 200);
        }

        for (int i = 0; i < main.array.length; i++) {
            for (int j = 0; j < main.array.length - 1; j++) {
                int temp = 0;
                int next = j + 1;
                if (main.array[j] > main.array[next]) {
                    temp = main.array[next];
                    main.array[next] = main.array[j];
                    main.array[j] = temp;
                }
                try {
                    Thread.sleep(1);
                }catch (Exception e) {

                }
                main.repaint();
            }
        }
    }

    int[] array = new int[315];
    int xloc = 0, yloc = 682, width = 3;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        for (int i = 0; i < array.length; i++) {
            xloc += width + 1;
            g.fillRect(xloc, yloc - array[i], width, array[i]);
        }
        xloc = 0;
    }
}
