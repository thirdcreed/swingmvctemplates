package org.template.mvc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JPanel;



public class TemplateView extends JPanel  {
	/*THIS IS THE VIEW IT SHOULD DO NOTHING BUT POLL THE MODEL AND DISPLAY	
	ITS INFORMATION*/
	
	private static final long serialVersionUID = 1L;
	private TemplateModel model;
    JButton templateComponent = new JButton("IPrintToConsole");

	/* instantiate layouts and individual components like panels and buttons
	 * Also include instance variables needed for display.*/


	TemplateView(TemplateModel aModel){
		this.model = aModel;
		this.model.addView(this);
		this.layoutView();
	}

	public void updateView(){

	}

	public void layoutView(){
		/* set up layouts panel etc..., register Controllers, 
		 * then update view and never be called again */
		this.add(templateComponent);
		registerControllers();
		updateView();
		

	}

	private void registerControllers()
	{
		/*this part has two sections first instantiate the controllers then 
		add them to the various components*/
		
		TemplateDragController controller = new TemplateDragController();

		
		this.templateComponent.addMouseMotionListener(controller);
		this.templateComponent.addMouseListener(controller);
		this.templateComponent.addActionListener(controller);
	}


	/* for drag and drop*/

	private class TemplateDragController extends Object
	implements MouseListener, MouseMotionListener,ActionListener
	{
   /* as many controllers as you want can be implemented here. If you want drag
	and drop for a component the easiest way is to extend some other component and
	add the mouse motion listener in that class
	CONTROLLERS SHOULD ONLY CHANGE THE MODEL NOTHING ELSE!!!*/

		public void mouseClicked(MouseEvent clicked) {
			System.out.println("clicked!");
		}
		public void mouseEntered(MouseEvent entered) {
			System.out.println("entered!");
		}
		public void mouseExited(MouseEvent exited) {
			System.out.println("exited");
		}
		public void mousePressed(MouseEvent pressed) {
			System.out.println("pressed");
		}
		public void mouseReleased(MouseEvent released) {
			System.out.println("released");
		}

		@Override
		public void mouseDragged(MouseEvent arg0) {
			System.out.println("dragging...!");

		}
		@Override
		public void mouseMoved(MouseEvent arg0) {
			

		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
	}


}
