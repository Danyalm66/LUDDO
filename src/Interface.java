import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JProgressBar;
import java.awt.Label;
import javax.swing.SwingConstants;

public class Interface {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 237, 257);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
//-----------------------------------------------------------------------------------------------------
// Home Buttons and label
//-----------------------------------------------------------------------------------------------------
		
		JLabel lblRollingDice1 = new JLabel("Rolling Dice");
		lblRollingDice1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblRollingDice1.setForeground(new Color(255, 255, 255));
		lblRollingDice1.setBounds(68, 47, 143, 22);
		frame.getContentPane().add(lblRollingDice1);
		
		Button button_1 = new Button("SINGLE");
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(128, 0, 128));
		button_1.setBounds(150, 105, 70, 22);
		frame.getContentPane().add(button_1);
		
		Button button = new Button("PAIR");
		button.setForeground(new Color(128, 0, 128));
		button.setBackground(Color.WHITE);
		button.setBounds(150, 83, 70, 22);
		frame.getContentPane().add(button);
		
		Button quit = new Button("Quit");
		quit.setForeground(Color.WHITE);
		quit.setBackground(Color.DARK_GRAY);
		quit.setBounds(150, 127, 70, 22);
		frame.getContentPane().add(quit);
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
						
		
		
//---------------------------------------------------------------------------------------------------
// Buttons and labels after pressing pair button
//---------------------------------------------------------------------------------------------------
		
		Button rollButton = new Button("Roll");				
		rollButton.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		rollButton.setForeground(new Color(128, 0, 128));
		rollButton.setBackground(Color.WHITE);
		rollButton.setBounds(1, 83, 126, 34);
		frame.getContentPane().add(rollButton);
		rollButton.setVisible(false);
		
		Button back = new Button("Back");
		back.setForeground(Color.WHITE);
		back.setBackground(Color.DARK_GRAY);
		back.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		back.setBounds(0, 0, 221, 22);
		frame.getContentPane().add(back);
		back.setVisible(false);
		
		JLabel rolledNum = new JLabel("");
		rolledNum.setHorizontalAlignment(SwingConstants.CENTER);
		rolledNum.setForeground(new Color(128, 0, 128));
		rolledNum.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 80));
		rolledNum.setBounds(0, 34, 109, 85);
		frame.getContentPane().add(rolledNum);
		rolledNum.setVisible(false);
		
		
		JLabel rollNum2 = new JLabel("");
		rollNum2.setHorizontalAlignment(SwingConstants.CENTER);
		rollNum2.setForeground(new Color(128, 0, 128));
		rollNum2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 80));
		rollNum2.setBounds(104, 125, 109, 85);
		frame.getContentPane().add(rollNum2);
		rollNum2.setVisible(false);
		
		
//-------------------------------------------------------------------------------------------------
// Buttons and labels after pressing single button
//-------------------------------------------------------------------------------------------------
		
		Button rollButton1 = new Button("Roll");
		rollButton1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		rollButton1.setForeground(new Color(128, 0, 128));
		rollButton1.setBackground(Color.WHITE);
		rollButton1.setBounds(1, 83, 126, 34);
		frame.getContentPane().add(rollButton1);
		rollButton1.setVisible(false);
		
		Button back2 = new Button("Back");
		back2.setForeground(Color.WHITE);
		back2.setBackground(Color.BLACK);
		back2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		back2.setBounds(0, 0, 221, 22);
		frame.getContentPane().add(back2);
		back2.setVisible(false);
		
		JLabel single = new JLabel("");
		single.setHorizontalAlignment(SwingConstants.CENTER);
		single.setBounds(10, 58, 201, 129);
		single.setForeground(new Color(128, 0, 128));
		single.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 80));
		frame.getContentPane().add(single);
		single.setVisible(false);		
		
		
//-------------------------------------------------------------------------------------------------
// Common things in pair and single buttons
//------------------------------------------------------------------------------------------------
		
		Button quit2 = new Button("Quit");
		quit2.setForeground(Color.WHITE);
		quit2.setBackground(new Color(128, 0, 128));
		quit2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		quit2.setBounds(1, 118, 126, 22);
		frame.getContentPane().add(quit2);
		quit2.setVisible(false);
		quit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		
		
		Button home = new Button("Home");
		home.setFont(new Font("Dialog", Font.BOLD, 12));
		home.setForeground(Color.WHITE);
		home.setBackground(Color.DARK_GRAY);
		home.setBounds(1, 141, 126, 22);
		frame.getContentPane().add(home);
		home.setVisible(false);

		
		JLabel imgLabel1 = new JLabel("New label");
		imgLabel1.setBounds(0, 0, 221, 219);
		frame.getContentPane().add(imgLabel1);
		ImageIcon image1 = new ImageIcon(getClass().getResource("/resource/images.jpg"));
		imgLabel1.setIcon(image1);
		
//----------------------------------------------------------------
// Action Listeners for pair button
//----------------------------------------------------------------
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button.setVisible(false);
				button_1.setVisible(false);
				lblRollingDice1.setVisible(false);
				quit.setVisible(false);
				rollButton.setVisible(true);
				quit2.setVisible(true);
				home.setVisible(true);
				ImageIcon image1 = new ImageIcon(getClass().getResource("/resource/img2.gif"));
				imgLabel1.setIcon(image1);
				
			}
		});

		rollButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rollButton.setVisible(false);
				back.setVisible(true);
				Die die1, die2;
				die1 = new Die();
				die2 = new Die();
				rolledNum.setVisible(true);
				rollNum2.setVisible(true);
				if(die2.chekRoll(die2.roll()) == true){
					if(die2.roll() == 1){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice1.gif"));
						rollNum2.setIcon(image2);
					}else if(die2.roll() == 2){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice2.jpg"));
						rollNum2.setIcon(image2);
					}else if(die2.roll() == 3){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice3.jpg"));
						rollNum2.setIcon(image2);
					}else if(die2.roll() == 4){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice4.jpg"));
						rollNum2.setIcon(image2);
					}else if(die2.roll() == 5){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice5.jpg"));
						rollNum2.setIcon(image2);
					}else{
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice6.jpg"));
						rollNum2.setIcon(image2);
				}if(die1.chekRoll(die1.roll())== true){
					if(die1.roll() == 1){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice1.gif"));
						rolledNum.setIcon(image2);
					}else if(die1.roll() == 2){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice2.jpg"));
						rolledNum.setIcon(image2);
					}else if(die1.roll() == 3){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice3.jpg"));
						rolledNum.setIcon(image2);
					}else if(die1.roll() == 4){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice4.jpg"));
						rolledNum.setIcon(image2);
					}else if(die1.roll() == 5){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice5.jpg"));
						rolledNum.setIcon(image2);
					}else {
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice6.jpg"));
						rolledNum.setIcon(image2);
					}
				}
//				rolledNum.setText(Integer.toString(die1.roll()));
//				rollNum2.setText(Integer.toString(die2.roll()));
				home.setVisible(false);
				quit2.setVisible(false);
			}
			}
		});
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				back.setVisible(false);
				rolledNum.setVisible(false);
				rollNum2.setVisible(false);
				rollButton.setVisible(true);
				quit2.setVisible(true);
				home.setVisible(true);
				
				
			}
		});
		
		
//-----------------------------------------------------------------
//Listeners for single button
//-----------------------------------------------------------------
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button.setVisible(false);
				button_1.setVisible(false);
				lblRollingDice1.setVisible(false);
				quit.setVisible(false);
				rolledNum.setVisible(false);
				rollNum2.setVisible(false);
				rollButton1.setVisible(true);
				quit2.setVisible(true);
				home.setVisible(true);
				ImageIcon image1 = new ImageIcon(getClass().getResource("/resource/img3.gif"));
				imgLabel1.setIcon(image1);
				
			}
		});
		
		rollButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rollButton1.setVisible(false);
				back2.setVisible(true);
				Die die2;
				die2 = new Die();
				single.setVisible(true);
				home.setVisible(false);
				quit2.setVisible(false);
				if(die2.chekRoll(die2.roll()) == true){
					if(die2.roll() == 1){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice1.gif"));
						single.setIcon(image2);
					}else if(die2.roll() == 2){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice2.jpg"));
						single.setIcon(image2);
					}else if(die2.roll() == 3){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice3.jpg"));
						single.setIcon(image2);
					}else if(die2.roll() == 4){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice4.jpg"));
						single.setIcon(image2);
					}else if(die2.roll() == 5){
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice5.jpg"));
						single.setIcon(image2);
					}else{
						ImageIcon image2 = new ImageIcon(getClass().getResource("/resource/dice6.jpg"));
						single.setIcon(image2);
			}
				}
			}
		});
		

		back2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				back2.setVisible(false);
				single.setVisible(false);
				rollButton1.setVisible(true);
				quit2.setVisible(true);
				home.setVisible(true);
				
				
			}
		});
//--------------------------------------------------------
// Common listeners
//-------------------------------------------------------
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button.setVisible(true);
				button_1.setVisible(true);
				rollButton.setVisible(false);
				quit2.setVisible(false);
				rollButton1.setVisible(false);
				quit.setVisible(true);
				home.setVisible(false);
				lblRollingDice1.setVisible(true);
				ImageIcon image1 = new ImageIcon(getClass().getResource("/resource/images.jpg"));
				imgLabel1.setIcon(image1);
			}
		});
	}
}
