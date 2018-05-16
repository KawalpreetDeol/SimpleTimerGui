package views;

import javax.swing.Timer;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.LineBorder;

public class TimerGui extends JFrame {
	private static final long serialVersionUID = 7526472295622776147L;
	private JPanel contentPane;
	private JTextField secondsField;
	private JButton btnStart;
	private JButton btnStop;
	private JButton btnReset;	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimerGui frame = new TimerGui();
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
	private Timer t;
	private int count = 0;
	private int minuteCount = 0;
	private int hourCount = 0;
	private int startCount = 0;
	
	
	private JTextField minutesField;
	private JTextField hoursField;
	private JTextField textField_4;
	private JTextField textField_5;
	
	public TimerGui() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TimerGui.class.getResource("/resources/timer_clock.png")));
		setTitle("Timer");
		setResizable(false);
		initComponents();
		createEvents();
	}
	
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 247, 167);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		
		secondsField = new JTextField();
		secondsField.setForeground(Color.BLUE);
		secondsField.setBorder(null);
		secondsField.setEditable(false);
		secondsField.setText("0");
		secondsField.setHorizontalAlignment(SwingConstants.CENTER);
		secondsField.setBackground(Color.WHITE);
		secondsField.setFont(new Font("Tahoma", Font.BOLD, 25));
		secondsField.setColumns(10);
		
		//Buttons
		btnStart = new JButton("Start");
		btnStart.setForeground(new Color(30, 144, 255));
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnStart.setBorder(null);
		btnStart.setBackground(Color.WHITE);
		
		btnStop = new JButton("Stop");
		btnStop.setForeground(new Color(30, 144, 255));
		btnStop.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnStop.setBorder(null);
		btnStop.setBackground(Color.WHITE);
		btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(30, 144, 255));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBorder(null);
		btnReset.setBackground(Color.WHITE);
		
		minutesField = new JTextField();
		minutesField.setText("0");
		minutesField.setHorizontalAlignment(SwingConstants.CENTER);
		minutesField.setForeground(Color.BLUE);
		minutesField.setFont(new Font("Tahoma", Font.BOLD, 25));
		minutesField.setEditable(false);
		minutesField.setColumns(10);
		minutesField.setBorder(null);
		minutesField.setBackground(Color.WHITE);
		
		hoursField = new JTextField();
		hoursField.setText("0");
		hoursField.setHorizontalAlignment(SwingConstants.CENTER);
		hoursField.setForeground(Color.BLUE);
		hoursField.setFont(new Font("Tahoma", Font.BOLD, 25));
		hoursField.setEditable(false);
		hoursField.setColumns(10);
		hoursField.setBorder(null);
		hoursField.setBackground(Color.WHITE);
		
		textField_4 = new JTextField();
		textField_4.setText(":");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(Color.BLUE);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground(Color.WHITE);
		
		textField_5 = new JTextField();
		textField_5.setText(":");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(Color.BLUE);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBackground(Color.WHITE);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnStop, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(btnReset, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(17))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(27)
					.addComponent(hoursField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(minutesField, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(secondsField, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(minutesField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(secondsField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(hoursField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnStart)
						.addComponent(btnReset)
						.addComponent(btnStop))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
	}
	
	private void createEvents() {
		//Timer Initialization
		t = new Timer(1000, new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				if (count < 60) {
					secondsField.setText(Integer.toString(count));
				}
				else if (count == 60) {
					count = 0;
					secondsField.setText(Integer.toString(count));
					minuteCount++;
					if (minuteCount == 60) {
						hourCount++;
						minuteCount = 0;
						minutesField.setText(Integer.toString(minuteCount));
						hoursField.setText(Integer.toString(hourCount));
					}
					minutesField.setText(Integer.toString(minuteCount));
				}
				
			}
		});
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.start();
			}
		});
		
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.stop();
			}
		});
		
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				minuteCount = 0;
				hourCount = 0;
				secondsField.setText(Integer.toString(count));
				minutesField.setText(Integer.toString(count));
				hoursField.setText(Integer.toString(count));
			}
		});
		}
}
