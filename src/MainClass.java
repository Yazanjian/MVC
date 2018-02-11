
public class MainClass {
	public static void main(String args[]){
ViewClass view=new ViewClass();
ModelClass model=new ModelClass();
ControllerClass control =new ControllerClass(view,model);
view.setVisible(true);

}
	
	
}
