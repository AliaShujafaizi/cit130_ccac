/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiassignment;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;

/**
 *
 * @author Alia
 */
public class FateGUI {

    Frame f = new Frame("Alia Return of the Obra Dinn GUI Assignment");
    Panel imgPanel = new Panel();
    Panel choicePanel = new Panel();
    Choice victim = new Choice();
    Choice fate = new Choice();
    Choice killer = new Choice();
    Label blank = new Label("");

    public FateGUI() {
        imgPanel.setLayout(new BorderLayout());
        imgPanel.add(new Label("1 Memory"), BorderLayout.SOUTH);
        imgPanel.add(new ImageComponent("src/guiassignment/img/abigail.png"));
        choicePanel.setLayout(new GridLayout(6,1));
        victim.add("This unknown soul");
        victim.add("Matthew");
        victim.add("Quinn");
        victim.add("Abigail");
        victim.add("Robert");
        victim.add("Cynthia");
        victim.add("Jessica");
        fate.add("suffered an unknown fate");
        fate.add("was shot by");
        fate.add("was strangled by");
        fate.add("drowned");
        fate.add("had a heart attack");
        killer.add("by an unknown attacker");
        killer.add("Matthew");
        killer.add("Quinn");
        killer.add("Abigail");
        killer.add("Robert");
        killer.add("Cynthia");
        killer.add("Jessica");
        killer.add("nobody");
        killer.add("themself");
        choicePanel.add(blank);
        choicePanel.add(victim);
        choicePanel.add(fate);
        choicePanel.add(killer);
        f.setLayout(new BorderLayout());
        f.add(imgPanel, BorderLayout.LINE_START);
        f.add(choicePanel, BorderLayout.CENTER);
        f.setSize(900, 400);
        f.setVisible(true);
//        showImage();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public class ImageComponent extends Component {

        BufferedImage img;

        public void paint(Graphics g) {
            g.drawImage(img, 0, 0, null);

        }

        public ImageComponent(String path) {
            try {
                img = ImageIO.read(new File(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public Dimension getPreferredSize() {
            if (img == null) {
                return new Dimension(100, 100);
            } else {
                return new Dimension(img.getWidth(), img.getHeight());
            }
        }
    }

    public static void main(String[] args) {
        FateGUI f = new FateGUI();
    }
}
