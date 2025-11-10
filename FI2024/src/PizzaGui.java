import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Pizza.Extras;
import Pizza.Grosse;
import Pizza.Pizza;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JButton;

public class PizzaGui
{

	private JFrame frame;
    private JLabel preisvalue;
    private JLabel gesamtpreisvalue;
    private JComboBox<Pizza> pizzabox;
    private JComboBox<Extras> extrabox;
    private JComboBox<Grosse> grossebox;
    private JList<String> pizzalist;
    private JButton  hinzufugen ; 
    private JButton removebutton;
    

	/**
	 * 
	 
	 * Launch the application.
	 */
//	public static void main(String[] args)
//	{
//		EventQueue.invokeLater(new Runnable()
//		{
//			public void run()
//			{
//				try {
//					PizzaGui window = new PizzaGui();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public PizzaGui()
	{
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
	
		
		frame = new JFrame();
        frame.setTitle("Pizza Bestellung");
        frame.setBounds(100, 100, 480, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Pizza");
        lblNewLabel.setBounds(20, 11, 46, 14);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblExtras = new JLabel("Extras");
        lblExtras.setBounds(20, 33, 46, 14);
        frame.getContentPane().add(lblExtras);
        
        JLabel lblGre = new JLabel("Größe");
        lblGre.setBounds(291, 11, 46, 14);
        frame.getContentPane().add(lblGre);
        
        JLabel lblPreis = new JLabel("Preis");
        lblPreis.setBounds(291, 33, 46, 14);
        frame.getContentPane().add(lblPreis);
        
        JLabel lblGesamtpreis = new JLabel("Gesamtpreis");
        lblGesamtpreis.setBounds(20, 240, 100, 14);
        frame.getContentPane().add(lblGesamtpreis);
        
        JLabel preisvalue = new JLabel("0.0€");
        preisvalue.setBounds(375, 33, 46, 14);
        frame.getContentPane().add(preisvalue);
        
        JLabel gesamtpreisvalue = new JLabel("0.0€");
        gesamtpreisvalue.setBounds(229, 240, 46, 14);
        frame.getContentPane().add(gesamtpreisvalue);
        
        pizzabox = new JComboBox();
        pizzabox.setBounds(92, 7, 109, 22);
        frame.getContentPane().add(pizzabox);
        	
        
        
       extrabox = new JComboBox();
        extrabox.setBounds(92, 40, 109, 22);
        frame.getContentPane().add(extrabox);
        
        	
        grossebox = new JComboBox();
        grossebox.setBounds(332, 7, 89, 22);
        frame.getContentPane().add(grossebox);
        
        	
         pizzalist = new JList();
        pizzalist.setBounds(80, 94, 221, 111);
        frame.getContentPane().add(pizzalist);
        
        JButton hinzufugen = new JButton("Hinzufugen");
        hinzufugen.setBounds(332, 161, 89, 44);
        frame.getContentPane().add(hinzufugen);
        
        JButton removebutton = new JButton("Remove");
        removebutton.setBounds(332, 226, 89, 44);
        frame.getContentPane().add(removebutton);
        
        
        frame.setVisible(true);
       
       
	}

	public void setPizzaModel(DefaultComboBoxModel<Pizza> pizzaAuswahl)
	{
		pizzabox.setModel(pizzaAuswahl);
		
	}
	
	public void setExtraModel(DefaultComboBoxModel<Extras> extraAuswahl)
	{
		extrabox.setModel(extraAuswahl);
		
	}

	public void setGrosseModel(DefaultComboBoxModel<Grosse> grosseAuswahl)
	{
		grossebox.setModel(grosseAuswahl);
		
	}

	
	
	   public JList<String> getPizzalist() 
	   {
	        return pizzalist;
	    }
    }


