package Projex;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.MatteBorder;

public class GroupPic extends JPanel {

	/**
	 * Create the panel.
	 */
	public GroupPic() {
		setSize(new Dimension(1980, 1080));
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("그룹 사진");
		lblNewLabel_1.setBorder(new MatteBorder(0, 0, 4, 0, (Color) new Color(210, 105, 30)));
		lblNewLabel_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1.setFont(new Font("BatangChe", Font.BOLD, 62));
		lblNewLabel_1.setBounds(815, 21, 294, 105);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("MainBg");
		lblNewLabel.setSize(new Dimension(1980, 1080));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ACER\\Desktop\\java\\bgSajin.jpg"));
		lblNewLabel.setBounds(0, 0, 1980, 1080);
		add(lblNewLabel);

	}

}
