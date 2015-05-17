import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;


public class Circle extends JFrame{
	JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JTextField jtfRadius = new JTextField(6);
	JTextField jtfArea = new JTextField(6);
  	JTextField jtfPerimeter = new JTextField(6);
	JButton jbtCalculate = new JButton("計算");
	JButton jbtDelete = new JButton("清除");
	double radius,area,perimeter;





public Circle(){

	p1.add(new JLabel("Circle:"));
	p2.add(new JLabel("Radius: "));
	p2.add(jtfRadius);
	p2.add(jbtCalculate);
	p2.add(jbtDelete);
	p3.add(new Label("               This area is: "));
	p3.add(jtfArea);
	p4.add(new Label("          This perimeter is: "));
	p4.add(jtfPerimeter);
	add(p1);
	add(p2);
	add(p3);
	add(p4);
	jbtCalculate.addActionListener(new CalculateListener());
	jbtDelete.addActionListener(new DeleteListener());
}

 private class CalculateListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
	radius = Integer.parseInt(jtfRadius.getText());
	area = radius * radius * 3.14;
	perimeter = radius * 2 * 3.14;
	jtfArea.setText(String.format("%.2f" ,area));
	jtfPerimeter.setText(String.format("%.2f" ,perimeter));
	}


}

 private class DeleteListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
	jtfRadius.setText("");
	jtfArea.setText("");
	jtfPerimeter.setText("");

	}


}

