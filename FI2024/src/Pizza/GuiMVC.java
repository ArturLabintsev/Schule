package Pizza;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;

public class GuiMVC extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton bestellenButton;
	private JComboBox<Pizza> pizzabox;
	private JComboBox<Grosse> grossebox;
	private JComboBox<Extras> extrasbox;
	private JLabel Pizza;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JLabel pizzapreis;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JLabel gesamtpreislabel;
	private JButton addButton;
	private JButton removeButton;
	private JList pizzalist;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args)
//	{
//		EventQueue.invokeLater(new Runnable()
//		{
//			public void run()
//			{
//				try {
//					GuiMVC frame = new GuiMVC();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public GuiMVC()
	{

		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBestellenButton());
		contentPane.add(getPizzabox());
		contentPane.add(getGrossebox());
		contentPane.add(getExtrasbox());
		contentPane.add(getPizza());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getPizzapreis());
		contentPane.add(getLblNewLabel_1_1_1_1_1());
		contentPane.add(getGesamtpreislabel());
		contentPane.add(getAddButton());
		contentPane.add(getRemoveButton());
		contentPane.add(getPizzalist());
	}
	 JButton getBestellenButton() 
	 {
		if (bestellenButton == null) 
		{
			bestellenButton = new JButton("Bestellen");
			bestellenButton.setBounds(335, 215, 89, 23);
		}
		return bestellenButton;
	}
	 JComboBox getPizzabox() 
	 {
		if (pizzabox == null) 
		{
			pizzabox = new JComboBox();
			pizzabox.setBounds(78, 11, 103, 22);
		}
		return pizzabox;
	}
	 JComboBox getGrossebox()
{
		if (grossebox == null) 
		{
			grossebox = new JComboBox();
			grossebox.setBounds(330, 11, 94, 22);
		}
		return grossebox;
	}
	 JComboBox getExtrasbox() 
	 {
		if (extrasbox == null) 
		{
			extrasbox = new JComboBox();
			extrasbox.setBounds(78, 63, 117, 22);
		}
		return extrasbox;
	}
	private JLabel getPizza() 
	{
		if (Pizza == null) 
		{
			Pizza = new JLabel("Pizza");
			Pizza.setBounds(10, 15, 46, 14);
		}
		return Pizza;
	}
	private JLabel getLblNewLabel_1() 
	{
		if (lblNewLabel_1 == null) 
		{
			lblNewLabel_1 = new JLabel("Extras");
			lblNewLabel_1.setBounds(10, 67, 46, 14);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() 
	
	{
		if (lblNewLabel_1_1 == null) 
		{
			lblNewLabel_1_1 = new JLabel("Grosse");
			lblNewLabel_1_1.setBounds(271, 15, 46, 14);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_1_1_1() 
	{
		if (lblNewLabel_1_1_1 == null) 
		{
			lblNewLabel_1_1_1 = new JLabel("Preis");
			lblNewLabel_1_1_1.setBounds(271, 67, 46, 14);
		}
		return lblNewLabel_1_1_1;
	}
	JLabel getPizzapreis() 
	{
		if (pizzapreis == null) 
		{
			pizzapreis = new JLabel("0,0€");
			pizzapreis.setBounds(335, 67, 46, 14);
		}
		return pizzapreis;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() 
	{
		if (lblNewLabel_1_1_1_1_1 == null) 
		{
			lblNewLabel_1_1_1_1_1 = new JLabel("Gesampreis");
			lblNewLabel_1_1_1_1_1.setBounds(10, 219, 46, 14);
		}
		return lblNewLabel_1_1_1_1_1;
	}
	 JLabel getGesamtpreislabel() 
	{
		if (gesamtpreislabel == null) 
		{
			gesamtpreislabel = new JLabel("0,0€");
			gesamtpreislabel.setBounds(186, 219, 46, 14);
		}
		return gesamtpreislabel;
	}
	 JButton getAddButton() 
	 {
		if (addButton == null) 
		{
			addButton = new JButton("Hinzufugen");
			addButton.setBounds(335, 109, 89, 23);
		}
		return addButton;
	}
	 JButton getRemoveButton() 
	 {
		if (removeButton == null) 
		{
			removeButton = new JButton("Remove");
			removeButton.setBounds(335, 146, 89, 23);
		}
		return removeButton;
	}
	 JList getPizzalist() 
	 {
		if (pizzalist == null) 
		{
			pizzalist = new JList();
			pizzalist.setBounds(50, 96, 275, 96);
		}
		return pizzalist;
	}
	
	
	
	public void setPizzaModel(DefaultComboBoxModel<Pizza> pizzaAuswahl)
	{
		pizzabox.setModel(pizzaAuswahl);
		
	}
	
	public void setExtraModel(DefaultComboBoxModel<Extras> extraAuswahl)
	{
		extrasbox.setModel(extraAuswahl);
		
	}

	public void setGrosseModel(DefaultComboBoxModel<Grosse> grosseAuswahl)
	{
		grossebox.setModel(grosseAuswahl);
		
	}
	

}
