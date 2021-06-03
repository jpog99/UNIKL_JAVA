package Projex;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class MemberSoge extends JPanel {

	/**
	 * Create the panel.
	 */
	public MemberSoge() {
		setSize(new Dimension(1980, 1080));
		setLayout(null);
		
		JLabel gifAmir = new JLabel("New label");
		gifAmir.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(153, 0, 102)));
		gifAmir.setIcon(new ImageIcon("ProjectData\\gifAmir.gif"));
		gifAmir.setForeground(new Color(255, 255, 255));
		gifAmir.setBounds(100, 346, 236, 286);
		add(gifAmir);
		
		JLabel gifMeor = new JLabel("New label");
		gifMeor.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(153, 0, 102)));
		gifMeor.setIcon(new ImageIcon("ProjectData\\gifMeor.gif"));
		gifMeor.setBounds(471, 346, 236, 286);
		add(gifMeor);
		
		JLabel gifWan = new JLabel("New label");
		gifWan.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(153, 0, 102)));
		gifWan.setIcon(new ImageIcon("ProjectData\\gifWan.gif"));
		gifWan.setBounds(842, 346, 236, 286);
		add(gifWan);
		
		JLabel gifShaq = new JLabel("New label");
		gifShaq.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(153, 0, 102)));
		gifShaq.setIcon(new ImageIcon("ProjectData\\gifShaq.gif"));
		gifShaq.setBounds(1204, 346, 236, 286);
		add(gifShaq);
		
		JLabel gifLaili = new JLabel("New label");
		gifLaili.setIcon(new ImageIcon("ProjectData\\gifLaili.gif"));
		gifLaili.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(153, 0, 102)));
		gifLaili.setBounds(1584, 346, 236, 286);
		add(gifLaili);
		
		JLabel lblNewLabel_6 = new JLabel("우리의 팀 멤버");
		lblNewLabel_6.setBorder(new MatteBorder(0, 0, 5, 0, (Color) new Color(128, 0, 128)));
		lblNewLabel_6.setForeground(new Color(255, 51, 255));
		lblNewLabel_6.setFont(new Font("Batang", Font.BOLD, 60));
		lblNewLabel_6.setBounds(750, 101, 441, 76);
		add(lblNewLabel_6);
		
		JLabel lblAmir = new JLabel("AMIR\r\n\r\n\r\n\r\n\r\n");
		lblAmir.setForeground(new Color(255, 255, 255));
		lblAmir.setFont(new Font("Rockwell Condensed", Font.BOLD, 55));
		lblAmir.setBounds(153, 656, 127, 103);
		add(lblAmir);
		
		JLabel lblMeor = new JLabel("MEOR");
		lblMeor.setForeground(Color.WHITE);
		lblMeor.setFont(new Font("Rockwell Condensed", Font.BOLD, 55));
		lblMeor.setBounds(524, 656, 183, 103);
		add(lblMeor);
		
		JLabel lblWan = new JLabel("WAN");
		lblWan.setForeground(Color.WHITE);
		lblWan.setFont(new Font("Rockwell Condensed", Font.BOLD, 55));
		lblWan.setBounds(907, 656, 109, 103);
		add(lblWan);
		
		JLabel lblShauqi = new JLabel("SHAUQI");
		lblShauqi.setForeground(Color.WHITE);
		lblShauqi.setFont(new Font("Rockwell Condensed", Font.BOLD, 55));
		lblShauqi.setBounds(1237, 656, 183, 103);
		add(lblShauqi);
		
		JLabel lblLaili = new JLabel("LAILI");
		lblLaili.setForeground(Color.WHITE);
		lblLaili.setFont(new Font("Rockwell Condensed", Font.BOLD, 55));
		lblLaili.setBounds(1648, 656, 138, 103);
		add(lblLaili);
		
		JLabel lblId_01 = new JLabel("52051217014");
		lblId_01.setForeground(new Color(255, 255, 255));
		lblId_01.setFont(new Font("Sitka Display", Font.PLAIN, 45));
		lblId_01.setBounds(100, 740, 251, 60);
		add(lblId_01);
		
		JLabel lblId_02 = new JLabel("52051217012");
		lblId_02.setForeground(Color.WHITE);
		lblId_02.setFont(new Font("Sitka Display", Font.PLAIN, 45));
		lblId_02.setBounds(471, 732, 237, 76);
		add(lblId_02);
		
		JLabel lblId_03 = new JLabel("52051217021");
		lblId_03.setForeground(Color.WHITE);
		lblId_03.setFont(new Font("Sitka Display", Font.PLAIN, 45));
		lblId_03.setBounds(842, 740, 251, 60);
		add(lblId_03);
		
		JLabel lblId_04 = new JLabel("52051217006");
		lblId_04.setForeground(Color.WHITE);
		lblId_04.setFont(new Font("Sitka Display", Font.PLAIN, 45));
		lblId_04.setBounds(1204, 740, 259, 60);
		add(lblId_04);
		
		JLabel lblId_05 = new JLabel("52051217026");
		lblId_05.setForeground(Color.WHITE);
		lblId_05.setFont(new Font("Sitka Display", Font.PLAIN, 45));
		lblId_05.setBounds(1597, 737, 259, 66);
		add(lblId_05);
		
		JLabel lblRole_01 = new JLabel("POWER POINT");
		lblRole_01.setForeground(new Color(255, 255, 255));
		lblRole_01.setFont(new Font("Sitka Display", Font.PLAIN, 45));
		lblRole_01.setBounds(85, 798, 283, 60);
		add(lblRole_01);
		
		JLabel lblRole_02 = new JLabel("UML");
		lblRole_02.setForeground(Color.WHITE);
		lblRole_02.setFont(new Font("Sitka Display", Font.PLAIN, 45));
		lblRole_02.setBounds(548, 798, 87, 60);
		add(lblRole_02);
		
		JLabel llbRole_03 = new JLabel("PROGRAMMER");
		llbRole_03.setForeground(Color.WHITE);
		llbRole_03.setFont(new Font("Sitka Display", Font.PLAIN, 45));
		llbRole_03.setBounds(821, 798, 283, 60);
		add(llbRole_03);
		
		JLabel lblRole_04 = new JLabel("DESIGNER");
		lblRole_04.setForeground(Color.WHITE);
		lblRole_04.setFont(new Font("Sitka Display", Font.PLAIN, 45));
		lblRole_04.setBounds(1223, 798, 240, 60);
		add(lblRole_04);
		
		JLabel lblRole_05 = new JLabel("PROGRAMMER");
		lblRole_05.setForeground(Color.WHITE);
		lblRole_05.setFont(new Font("Sitka Display", Font.PLAIN, 45));
		lblRole_05.setBounds(1582, 798, 298, 60);
		add(lblRole_05);
		
		JLabel lblNewLabel = new JLabel("BackGround");
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 50));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("ProjectData\\bgSoge.jpg"));
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		add(lblNewLabel);

	}
}
