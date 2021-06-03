package Projex;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;

public class sogamAmir extends JPanel {

	/**
	 * Create the panel.
	 */
	public sogamAmir() throws Exception {
		setSize(new Dimension(1920, 1080));
		setLayout(null);
		
		JLabel selfpic = new JLabel();
		selfpic.setIcon(new ImageIcon("ProjectData\\picAmir.jpg"));
		selfpic.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(139, 0, 139)));
		selfpic.setBounds(137, 109, 539, 730);
		add(selfpic);
		
		JPanel cardpane = new JPanel();
		cardpane.setOpaque(false);
		cardpane.setBounds(699, 98, 1211, 883);
		add(cardpane);
		cardpane.setLayout(new CardLayout(0, 0));
		
		JPanel panelbio = new JPanel();
		panelbio.setOpaque(false);
		cardpane.add(panelbio, "name_83256230080672");
		panelbio.setLayout(null);
		
		JLabel titlebio = new JLabel("제 바이오");
		titlebio.setBackground(new Color(255, 255, 255));
		titlebio.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(199, 21, 133)));
		titlebio.setForeground(new Color(255, 0, 255));
		titlebio.setFont(new Font("Batang", Font.BOLD, 60));
		titlebio.setBounds(467, -5, 277, 87);
		panelbio.add(titlebio);
		
		JTextArea bio = new JTextArea();
		bio.setEditable(false);
		bio.setOpaque(false);
		bio.setBackground(Color.WHITE);
		bio.setText("학번:52051217014\r\n\r\r\n생일:12/5/1999\r\n\r\r\n이메일: amirramli007@gmail.com\r\n\r\r\n전화 번호: +60 12-328 1140\r\r\n\r\r\n");
		bio.setForeground(new Color(255, 20, 147));
		bio.setFont(new Font("Batang", Font.BOLD, 40));
		bio.setBounds(10, 93, 1191, 355);
		panelbio.add(bio);
		
		JTextArea quote = new JTextArea();
		quote.setEditable(false);
		quote.setOpaque(false);
		quote.setText("   \"SMILE. DON'T WORRY.\r\n                      LIFE IS AWESOME.\"");
		quote.setForeground(new Color(255, 20, 147));
		quote.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 48));
		quote.setBounds(10, 448, 1191, 138);
		panelbio.add(quote);
		
		JPanel panelsogam = new JPanel();
		panelsogam.setOpaque(false);
		cardpane.add(panelsogam);
		panelsogam.setLayout(null);
		
		
		JLabel titlesogam = new JLabel("제 소감");
		titlesogam.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(128, 0, 128)));
		titlesogam.setForeground(new Color(255, 0, 255));
		titlesogam.setFont(new Font("Batang", Font.BOLD, 60));
		titlesogam.setBounds(489, 11, 233, 78);
		panelsogam.add(titlesogam);
		
		JTextArea sogam = new JTextArea();
		sogam.setOpaque(false);
		sogam.setBackground(Color.WHITE);
		sogam.setForeground(new Color(255, 20, 147));
		sogam.setEditable(false);
		sogam.setFont(new Font("Batang", Font.BOLD | Font.ITALIC, 38));
		sogam.setBounds(10, 112, 1091, 365);
		panelsogam.add(sogam); 
		
		
		try{
        String strLine;
        File selectedFile = new File("amir.txt");
        FileInputStream in = new FileInputStream(selectedFile);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        while ((strLine = br.readLine()) != null) {
            sogam.append(strLine + "\n");
        }
        }catch(Exception e){}
		
		
		JPanel panelgall = new JPanel();
		panelgall.setOpaque(false);
		cardpane.add(panelgall);
		panelgall.setLayout(null);
		panelgall.setVisible(false);
		
		JLabel titlegall = new JLabel("제 추억");
		titlegall.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(139, 0, 139)));
		titlegall.setForeground(new Color(255, 0, 255));
		titlegall.setFont(new Font("Batang", Font.BOLD, 60));
		titlegall.setBounds(464, 5, 283, 81);
		panelgall.add(titlegall);
		
		JLabel nametitle = new JLabel("\r\n");
		nametitle.setIcon(new ImageIcon("ProjectData\\GALLAMIR.png"));
		nametitle.setBounds(10, 78, 1191, 762);
		panelgall.add(nametitle);
		
		
		
      
		JButton btnBiodata = new JButton("바이오\r\n");
		btnBiodata.setFont(new Font("Batang", Font.BOLD, 23));
		btnBiodata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardpane.removeAll();
				cardpane.add(panelbio);
				cardpane.repaint();
				cardpane.revalidate();
			}
		});
		btnBiodata.setBounds(137, 869, 117, 47);
		add(btnBiodata);
		
		JButton btngall = new JButton("갤러리");
		btngall.setFont(new Font("Batang", Font.BOLD, 25));
		btngall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardpane.removeAll();
				cardpane.add(panelgall);
				cardpane.repaint();
				cardpane.revalidate();
			}
		});
		btngall.setBounds(559, 869, 117, 47);
		add(btngall);
		
		JButton btnsogam = new JButton("소감");
		btnsogam.setFont(new Font("Batang", Font.BOLD, 24));
		btnsogam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardpane.removeAll();
				cardpane.add(panelsogam);
				cardpane.repaint();
				cardpane.revalidate();
			}
		});
		btnsogam.setBounds(352, 869, 117, 47);
		add(btnsogam);
		
		JLabel lblMuhammadAmirBin = new JLabel("MUHAMMAD AMIR BIN MUHD RAMLI NARAYANAN");
		lblMuhammadAmirBin.setForeground(new Color(255, 0, 255));
		lblMuhammadAmirBin.setFont(new Font("Mistral", Font.BOLD, 60));
		lblMuhammadAmirBin.setBounds(397, 29, 1126, 58);
		add(lblMuhammadAmirBin);
		
		JLabel mainbg = new JLabel("");
		mainbg.setIcon(new ImageIcon("ProjectData\\bgAmir.jpg"));
		mainbg.setBounds(0, 0, 1920, 1080);
		add(mainbg);
	
}
}
