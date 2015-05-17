import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;

public class Rectangle extends JFrame{
	JPanel p5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p7 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p8 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JTextField jtfLength = new JTextField(6);
	JTextField jtfWidth = new JTextField(6);
  	JTextField jtfArea1 = new JTextField(6);
	JTextField jtfPerimeter1 = new JTextField(6);
	JButton jbtCalculate1 = new JButton("計算");
	JButton jbtDelete1 = new JButton("清除");
	double length,width,area1,perimeter1;

public  Rectangle(){

	p5.add(new JLabel("Rectangle:"));
	p6.add(new JLabel("Length: "));
	p6.add(jtfLength);
	p6.add(new JLabel("Width: "));
	p6.add(jtfWidth);
	p6.add(jbtCalculate1);
	p6.add(jbtDelete1);
	p7.add(new Label("               This area is: "));
	p7.add(jtfArea1);
	p8.add(new Label("          This perimeter is: "));
	p8.add(jtfPerimeter1);
	jbtCalculate1.addActionListener(new RectangleListener());
	jbtDelete1.addActionListener(new Delete1Listener());
}

private class RectangleListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
	length = Integer.parseInt(jtfLength.getText());
	width = Integer.parseInt(jtfWidth.getText());
	area1 = length * width;
	perimeter1 = (length + width) * 2;
	jtfArea1.setText(String.format("%.2f" ,area1));
	jtfPerimeter1.setText(String.format("%.2f" ,perimeter1));
	}


}

private class Delete1Listener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
	jtfLength.setText("");
	jtfWidth.setText("");
	jtfArea1.setText("");
	jtfPerimeter1.setText("");
	}


}


}
