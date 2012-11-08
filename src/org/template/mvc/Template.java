package org.template.mvc;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Template extends JFrame {


	public static void main(String[] args) {
		
		/*Essentially this class just serves as a place to put a main, and set up 
		the Original Jframe, later we might put a JMenu here as well.*/
		
		TemplateModel model = new TemplateModel();
		TemplateView view = new TemplateView(model);
		
		JFrame template = new JFrame();
		template.setTitle("Template");
		template.setSize(750, 750);
        template.setLocationRelativeTo(null);
        template.setContentPane(view);
		template.setDefaultCloseOperation(EXIT_ON_CLOSE);
		template.setVisible(true);
		
		

	}
    
}
