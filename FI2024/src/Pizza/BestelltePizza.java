package Pizza;

public class BestelltePizza
{

		private Pizza pizza ; 
		private Extras extra ; 
		private Grosse grosse ; 

		
		BestelltePizza(Pizza pizza, Extras extra, Grosse grosse)
		{
			this.pizza = pizza;
	        this.extra = extra;
	        this.grosse = grosse;
	        
	        
		}
		
		public double getPreis()
		{
			return pizza.getPreis() + extra.getPreis() + grosse.getPreis(); 
		}
		
		@Override
	    public String toString() 
		{
	        return String.format("%s, %s, %s - %.2f €", pizza.getName(), grosse.getName(), extra.getName(), getPreis());
	    }
}/*Sgfv*/

