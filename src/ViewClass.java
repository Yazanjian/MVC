import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ViewClass extends JFrame {
	private JTextField NumberOne=new JTextField(10);
	private JTextField NumberTwo=new JTextField(10);
	private JLabel Number1=new JLabel("First Number");
	private JLabel Number2=new JLabel("Second Number");
	private JTextField result=new JTextField(10);
	private JLabel resultLabel=new JLabel("result");
	
	public JButton add=new JButton("ADD");
	
	public ViewClass(){
		JPanel panel=new JPanel();
		panel.add(Number1);
		panel.add(NumberOne);
		panel.add(Number2);
		panel.add(NumberTwo);
		panel.add(result);
		panel.add(resultLabel);
		panel.add(add);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		
		this.add(panel);
	}

public void listener(ActionListener handler){
	add.addActionListener(handler);
}

public int getFirstNumber(){
	int first;
	first=Integer.parseInt(NumberOne.getText());
	return first;
}

public int getSecondNumber(){
	int second;
	second=Integer.parseInt(NumberTwo.getText());
	return second;
}

public void setResult(int result){
	this.result.setText(new DecimalFormat("##.###").format(result));
}
	



	
	

}
