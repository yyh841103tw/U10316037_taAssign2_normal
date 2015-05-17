import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;

public class U10316037_GeoCalculate extends JFrame{

public U10316037_GeoCalculate(){

Circle spirit = new Circle();
	add(spirit.p1);
	add(spirit.p2);
	add(spirit.p3);
	add(spirit.p4);

Rectangle spirit1 = new Rectangle();
	add(spirit1.p5);
	add(spirit1.p6);
	add(spirit1.p7);
	add(spirit1.p8);
Square spirit2 = new Square();
	add(spirit2.p9);
	add(spirit2.p10);
	add(spirit2.p11);
	add(spirit2.p12);
}

/** Main method */
  public static void main(String[] args) {
    JFrame frame = new U10316037_GeoCalculate();
    frame.setLayout(new GridLayout(10,5));
    frame.setTitle("U10316037_GeoCalculate");
    frame.setSize(800,800);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
