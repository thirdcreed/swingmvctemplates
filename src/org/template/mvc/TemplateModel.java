package org.template.mvc;
import java.util.ArrayList;


public class TemplateModel  
{
	private ArrayList<TemplateView> views = new ArrayList<TemplateView>();

	public TemplateModel(){


	}
	public void addView(TemplateView view) {
		this.views.add(view); //called in the view with model.addView(this);
      }

	public void removeView(TemplateView view) {
		this.views.remove(view);

	}

	public void updateAllViews() {
		for (TemplateView view: this.views)
		{
			view.updateView(); 
			/*call after you change anything in the model
			this is the only thing your model knows how to do to the view!*/
		}



	}
}