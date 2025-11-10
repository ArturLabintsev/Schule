package ratespiel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ratespiel extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private TextField text;
	private JLabel gwonen;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try {
					Ratespiel frame = new Ratespiel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ratespiel()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		int  zahl = (int) (Math.random() * 10 + 1);
		
		int gegeben;
		
		JLabel lblNewLabel = new JLabel("Zahl 1 bis 10");
		lblNewLabel.setBounds(38, 38, 104, 14);
		contentPane.add(lblNewLabel);
		
		Button button = new Button("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
         {
				int gegeben = Integer.parseInt(text.getText());
                if (gegeben == zahl) {
                    gwonen.setText("Gewonnen! Die Zahl war " + zahl);
                } else {
                    gwonen.setText("Verloren! Versuche es nochmal.");
                }
			}
		});
		button.setBounds(332, 38, 70, 22);
		contentPane.add(button);
		
		text = new TextField();
		text.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				
			}
		});
		text.setBounds(194, 38, 98, 22);
		contentPane.add(text);
		
		 gwonen = new JLabel("New label");
		gwonen.setBounds(71, 96, 296, 22);
		contentPane.add(gwonen);

	}
}
