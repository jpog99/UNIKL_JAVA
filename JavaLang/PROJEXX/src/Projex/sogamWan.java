package Projex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class sogamWan extends JPanel {

	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public sogamWan() throws Exception {
		setSize(new Dimension(1920, 1080));
		setLayout(null);
		
		JLabel selfpic = new JLabel("");
		selfpic.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 128, 0)));
		selfpic.setIcon(new ImageIcon("ProjectData\\picWan.jpg"));
		selfpic.setBounds(137, 98, 539, 760);
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
		titlebio.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 128, 0)));
		titlebio.setForeground(new Color(0, 255, 0));
		titlebio.setFont(new Font("Batang", Font.BOLD, 60));
		titlebio.setBounds(467, 11, 277, 87);
		panelbio.add(titlebio);
		
		JTextArea bio = new JTextArea();
		bio.setEditable(false);
		bio.setBounds(10, 103, 1211, 339);
		panelbio.add(bio);
		bio.setText("학번: 52051217012\r\n \r\r\n생일: 27/06/1999\r\n\r\r\n이메일: prof.wan@yahoo.com\r\n\r\r\n전화 번호: +60 13-362 8870\r\r\n\r\r\n");
		bio.setOpaque(false);
		bio.setForeground(new Color(152, 251, 152));
		bio.setFont(new Font("Batang", Font.BOLD, 40));
		
		JTextArea quote = new JTextArea();
		quote.setEditable(false);
		quote.setText("\"Well, I'm not gonna live my life \r\n      based on some inspirational quotes\"");
		quote.setOpaque(false);
		quote.setForeground(new Color(152, 251, 152));
		quote.setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 48));
		quote.setBounds(10, 500, 1191, 410);
		panelbio.add(quote);
		
		
		JPanel panelsogam = new JPanel();
		panelsogam.setOpaque(false);
		cardpane.add(panelsogam);
		panelsogam.setLayout(null);
		
		
		JLabel titlesogam = new JLabel("제 소감");
		titlesogam.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 128, 0)));
		titlesogam.setForeground(new Color(0, 255, 0));
		titlesogam.setFont(new Font("Batang", Font.BOLD, 60));
		titlesogam.setBounds(489, 11, 233, 78);
		panelsogam.add(titlesogam);
		
		JTextArea sogam = new JTextArea();
		sogam.setForeground(new Color(144, 238, 144));
		sogam.setOpaque(false);
		sogam.setEditable(false);
		sogam.setFont(new Font("Batang", Font.BOLD | Font.ITALIC, 38));
		sogam.setBounds(10, 112, 1091, 530);
		panelsogam.add(sogam); 
		
		
		try{
        String strLine;
        File selectedFile = new File("wan.txt");
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
		titlegall.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(0, 128, 0)));
		titlegall.setForeground(new Color(0, 255, 0));
		titlegall.setFont(new Font("Batang", Font.BOLD, 60));
		titlegall.setBounds(464, 5, 283, 81);
		panelgall.add(titlegall);
		
		JLabel galleryWan = new JLabel("New label");
		galleryWan.setIcon(new ImageIcon("ProjectData\\gallWan.png"));
		galleryWan.setBounds(10, 78, 1191, 762);
		panelgall.add(galleryWan);
		
		
		
      
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
		
		JLabel nametitle = new JLabel("WAN MUHAMMAD FIRDAUS BIN WAN NAWAWI\r\n");
		nametitle.setForeground(new Color(0, 255, 0));
		nametitle.setFont(new Font("Mistral", Font.BOLD, 53));
		nametitle.setBounds(476, 29, 968, 58);
		add(nametitle);
		
		JLabel mainbg = new JLabel("");
		mainbg.setIcon(new ImageIcon("ProjectData\\bgWan.jpg"));
		mainbg.setBounds(0, 0, 1920, 1080);
		add(mainbg);
	
}
}
