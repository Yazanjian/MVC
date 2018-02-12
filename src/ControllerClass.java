import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerClass {
	ViewClass view;
	ModelClass model;
	thisListener handler=new thisListener();
	
	public ControllerClass(ViewClass view,ModelClass model){
		this.view=view;
		this.model=model;
		view.listener(handler);
	}

	class thisListener implements ActionListener{
		
	@Override
	public void actionPerformed(ActionEvent e) {
		double firstNo,secondNo;
		firstNo=view.getFirstNumber();
		secondNo=view.getSecondNumber();
	

		if(e.getSource()==view.add){
			model.add(view.getFirstNumber(), view.getSecondNumber());
		}
		view.setResult(model.getResult());
		
	}
	
	}
}
