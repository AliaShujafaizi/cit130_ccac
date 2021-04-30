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
/**
 *
 * @author Alia
 */
public class FateGUI {
    public FateGUI(){
        Frame f = new Frame();
        Button b = new Button("Click");
       // Image i = new ImageComponent();
        b.setBounds(30, 50, 80, 30);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    
    public class ImageComponent extends Component{
        BufferedImage img;
        public void paint(Graphics g){
            g.drawImage(img, 0, 0, null);
            
        }
        public ImageComponent(String path){
            try{
                img = ImageIO.read(new File(path));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        public Dimension getPreferredSize(){
            if(img == null){
                return new Dimension(100, 100);
            }else{
                return new Dimension(img.getWidth(), img.getHeight());
            }
        }
    }
    public static void main(String[] args) {
        FateGUI f = new FateGUI();
    }
}
