import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;

public class Square extends JFrame{
	JPanel p9 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p10 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p11 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p12 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JTextField jtfSide = new JTextField(6);
  	JTextField jtfArea2 = new JTextField(6);
	JTextField jtfPerimeter2 = new JTextField(6);
	JButton jbtCalculate2 = new JButton("計算");
	JButton jbtDelete2 = new JButton("清除");
	double side,area2,perimeter2;

public  Square(){

	p9.add(new JLabel("Triangle:"));
	p10.add(new JLabel("Side: "));
	p10.add(jtfSide);
	p10.add(jbtCalculate2);
	p10.add(jbtDelete2);
	p11.add(new Label("               This area is: "));
	p11.add(jtfArea2);
	p12.add(new Label("          This perimeter is: "));
	p12.add(jtfPerimeter2);
	jbtCalculate2.addActionListener(new SquareListener());
	jbtDelete2.addActionListener(new Delete2Listener());
}
private class SquareListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
	side = Integer.parseInt(jtfSide.getText());
	area2 = side * side;
	perimeter2 = side * 4;
	jtfArea2.setText(String.format("%.2f" ,area2));
	jtfPerimeter2.setText(String.format("%.2f" ,perimeter2));
	}


}
private class Delete2Listener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
	jtfSide.setText("");
	jtfArea2.setText("");
	jtfPerimeter2.setText("");
	}


}


}
