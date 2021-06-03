package Projex;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class MainWindow extends JFrame {
	 private static final int FRAME_WIDTH = 1980;
	  private static final int FRAME_HEIGHT = 1080;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	
	public static void main(String[] args) throws Exception {
		new MainWindow();
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public MainWindow() throws Exception {
		
		
		
		setTitle("test");
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		
		
		contentPane = new JPanel();
	
		setContentPane(contentPane);
	    contentPane.setLayout(null);
	    
	    JLabel mainbg = new JLabel();
	    mainbg.setIcon(new ImageIcon("ProjectData\\bgMain.png"));
	    
	    
	    
	    GroupPic gp = new GroupPic();
		projectJejak sctest = new projectJejak();
		sogamWan wan = new sogamWan();
		sogamAmir amir = new sogamAmir();
		sogamLaili laili = new sogamLaili();
		sogamMeor meor = new sogamMeor();
		sogamShaq shaq = new sogamShaq();
		MemberSoge ms = new MemberSoge();
		
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(0, 0, 1924, 1041);
		tabbedPane.setBackground(Color.PINK);
		contentPane.add(tabbedPane);
		
		JTabbedPane tabbedPane_8 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("메인 탭", null, tabbedPane_8, null);
		
		JTabbedPane tabbedPane_9 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_8.addTab("그룹 이름", null, mainbg, null);
		
		JTabbedPane tabbedPane_10 = new JTabbedPane(JTabbedPane.TOP);
	    
	    JLayeredPane layeredPane = new JLayeredPane();
	    tabbedPane_8.addTab("멤버 소개", null, ms, null);
	    
	   
	    tabbedPane_8.addTab("제작과정", null, sctest, null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		tabbedPane_8.addTab("UML", null, panel, null);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("ProjectData\\uml.jpg"));
		label.setBounds(317, 132, 1280, 720);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_8.addTab("그룹 사진", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("ProjectData\\gpSajin.png"));
		lblNewLabel_1.setBounds(170, 64, 1573, 856);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("ProjectData\\bgSajin.jpg"));
		lblNewLabel.setBounds(0, 0, 1920, 974);
		panel_1.add(lblNewLabel);

		
		
		JTabbedPane tabbedPane_2 = new JTabbedPane();
		tabbedPane.addTab("멤버", null, tabbedPane_2, null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane();
		tabbedPane_2.addTab("샤우키", null,shaq , null);
		
		JTabbedPane tabbedPane_5 = new JTabbedPane();
		tabbedPane_2.addTab("미어르", null, meor, null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane();
		tabbedPane_2.addTab("완", null, wan, null);

		JTabbedPane tabbedPane_6 = new JTabbedPane();
		tabbedPane_2.addTab("라이리", null, laili, null);
		
		JTabbedPane tabbedPane_7 = new JTabbedPane();
		tabbedPane_2.addTab("아미르", null, amir, null);
		
		
		
	}
}

