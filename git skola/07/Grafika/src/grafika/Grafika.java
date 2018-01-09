/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafika;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author student
 */
public class Grafika {

    private JFrame window;
    private JButton drawButton;
    private JButton restartButton;
    private JLabel headLabel;
    private Image image;
    private Timer timer;
    
    public Grafika(String title,int width,int height){
;
        window = new JFrame(title);
        try{
            this.image = ImageIO.read(this.getClass().getResource("image.png"));
        }catch(IOException ex){
            
        }
        window.setIconImage(this.image);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(width,height);
        /*Vytvoreni napisu okna*/
        headLabel = new JLabel(title);
        int style = Font.BOLD | Font.ITALIC;
        Font font = new Font("Arial",style,25);
        headLabel.setFont(font);
        headLabel.setBackground(Color.red);
        headLabel.setOpaque(true);
        headLabel.setForeground(Color.blue);
        headLabel.setBorder(new EmptyBorder(10,0,10,0));
        headLabel.setHorizontalAlignment(JLabel.CENTER);
        /*Vytvoreni tlačítka*/
        Platno platno = new Platno();
        platno.init();
        
        drawButton = new JButton("Random");
        drawButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("udelano 10 objektu");
                
                
                for(int i=0;i<10;i++){
                    int x = (int)Math.floor(Math.random()*platno.getWidth());
                    int y = (int)Math.floor(Math.random()*platno.getHeight());
                    platno.setPoint(x,y,true);
                    platno.repaint();
                }
            }
            
        });
        restartButton = new JButton("Restart");
        restartButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Restart");
            }
            
        });
        
        Container pane = window.getContentPane();
        pane.add(headLabel,BorderLayout.PAGE_START);
        pane.add(drawButton,BorderLayout.PAGE_END);
        //pane.add(restartButton,BorderLayout.AFTER_LINE_ENDS);
        pane.add(platno,BorderLayout.CENTER);
        window.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        new Grafika("copy",800,600);
    }
    
}
