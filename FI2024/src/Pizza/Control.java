package Pizza;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class Control
{
	
	private DefaultComboBoxModel<Pizza> pizzaAuswahl;
	private DefaultComboBoxModel<Extras> extraAuswahl;
	private DefaultComboBoxModel<Grosse> grosseAuswahl;
	 private DefaultListModel<BestelltePizza> listModel;
	private GuiMVC view;
	
	public Control()
	{
		//view = new PizzaGui();
		view = new GuiMVC();
		view.setVisible(true);
		
		
        pizzaAuswahl = new DefaultComboBoxModel<>();
        extraAuswahl = new DefaultComboBoxModel<>();
        grosseAuswahl = new DefaultComboBoxModel<>();
        
        listModel = new DefaultListModel<>();
        view.getPizzalist().setModel(listModel);
    
        view.setPizzaModel(pizzaAuswahl);
        view.setExtraModel(extraAuswahl);
        view.setGrosseModel(grosseAuswahl);
        
        
     
   
       
        
        view.getPizzabox().addActionListener(e -> aktualisierungPreis());
        view.getExtrasbox().addActionListener(e -> aktualisierungPreis());
        view.getGrossebox().addActionListener(e -> aktualisierungPreis());
        
        view.getAddButton().addActionListener(e -> addPizzaToList());
        view.getBestellenButton().addActionListener(e -> gesamtPreis());
        
        
        erzeugeTestdaten();
		
	
		


		
		
	
	
	}

	private void erzeugeTestdaten()
	{
		pizzaAuswahl.addElement(new Pizza("Salami", 8.00, new Grosse("Klein", 0.0), new Extras("Kein", 0.0)));
        pizzaAuswahl.addElement(new Pizza("Margherita", 7.50, new Grosse("Klein", 0.0), new Extras("Kein", 0.0)));
        pizzaAuswahl.addElement(new Pizza("Vier Käse", 9.00, new Grosse("Klein", 0.0), new Extras("Kein", 0.0)));

        extraAuswahl.addElement(new Extras("Kein", 0.0));
        extraAuswahl.addElement(new Extras("Extra Käse", 1.5));
        extraAuswahl.addElement(new Extras("Schinken", 1.5));
        extraAuswahl.addElement(new Extras("Oliven", 1.0));

        grosseAuswahl.addElement(new Grosse("Klein", 0.0));
        grosseAuswahl.addElement(new Grosse("Normal", 1.0));
        grosseAuswahl.addElement(new Grosse("Gross", 2.0));
	}

    
	public void aktualisierungPreis()
	{
		Pizza pizza = (Pizza) pizzaAuswahl.getSelectedItem();
		Extras extra = (Extras) extraAuswahl.getSelectedItem(); 
		Grosse grosse = (Grosse) grosseAuswahl.getSelectedItem(); 
		
		if(pizza!= null && extra != null && grosse != null)
		{
			double gesamtPreis = pizza.getPreis() + extra.getPreis() + grosse.getPreis();
			view.getPizzapreis().setText(String.format("%.2f €", gesamtPreis));
		}
	
	}
	
	
	private void addPizzaToList() 
	{
	    Pizza pizza = (Pizza) pizzaAuswahl.getSelectedItem();
	    Extras extra = (Extras) extraAuswahl.getSelectedItem();
	    Grosse grosse = (Grosse) grosseAuswahl.getSelectedItem();
	    
	    if (pizza != null && extra != null && grosse != null) 
	    {
	    	BestelltePizza bp = new BestelltePizza(pizza, extra, grosse);
	    	 listModel.addElement(bp);
	        
	      
	    }
	    
	    
	}
	
	
	public void  gesamtPreis()
	{
		double gesamtpreis = 0.0;
		
		for(int i = 0; i < listModel.getSize(); i++)
		{
		    BestelltePizza bp = listModel.getElementAt(i);
		    gesamtpreis += bp.getPreis();
		}
		
		
		view.getGesamtpreislabel().setText(String.format("%.2f €", gesamtpreis));
		
	}
	
}

