package Projex;

import javax.swing.*;
import java.awt.*;


public class projectJejak extends JPanel {
                
	            JLabel title = new JLabel();
		        JLabel gif1 = new JLabel();
		        JTextArea p1title = new JTextArea();
		        JTextArea process1 = new JTextArea();
		        JLabel gif2 = new JLabel();
		        JLabel gif22 = new JLabel();
		        JLabel gif23 = new JLabel();
		        JTextArea p2title = new JTextArea();
		        JTextArea process2 = new JTextArea();
		        JLabel pic3 = new JLabel();
		        JLabel pic32 = new JLabel();
		        JTextArea p3title = new JTextArea();
		        JTextArea process3 = new JTextArea();
		        JLabel gif4 = new JLabel();
		        JLabel gif42 = new JLabel();
		        JLabel gif43 = new JLabel();
		        JTextArea p4title = new JTextArea();
		        JTextArea process4 = new JTextArea();
		        JLabel gif5 = new JLabel();
		        JLabel gif52 = new JLabel();
		        JTextArea p5title = new JTextArea();
		        JTextArea process5 = new JTextArea();
		        JLabel mainbg = new JLabel();
		        
		        
		       
		     
	/**
	 * Create the panel.
	 */
	public projectJejak() {

		       

		        setPreferredSize(new java.awt.Dimension(1920, 1080));
		        setLayout(null);
		        
		        JScrollPane scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(0, 0, 1920, 1080);
				scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				add(scrollPane_1);
				
				mainbg.setIcon(new ImageIcon("ProjectData\\jejakbg.jpg")); // NOI18N
		        mainbg.setBounds(0, 0, 1920, 5400);
		        scrollPane_1.setViewportView(mainbg);
		        title.setAlignmentX(Component.CENTER_ALIGNMENT);

		        title.setFont(new Font("Batang", 3, 72)); // NOI18N
		        title.setForeground(new Color(253, 255, 14));
		        title.setHorizontalAlignment(SwingConstants.CENTER);
		        title.setText("프로젝트 제작과정");
		        title.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(255, 255, 51)));
		        title.setBounds(700, 20, 700, 100);

		        gif1.setIcon(new ImageIcon("ProjectData\\gifStart.gif")); // NOI18N
		        gif1.setBounds(140, 370, 600, 336);

		        p1title.setBackground(new Color(0,0,0,0));
		        p1title.setColumns(20);
		        p1title.setFont(new java.awt.Font("Batang", 3, 48)); // NOI18N
		        p1title.setRows(5);
		        p1title.setText("우리의 첫 미팅 :");
		        p1title.setOpaque(false);
		        p1title.setBounds(780, 370, 410, 60);

		        process1.setBackground(new Color(0,0,0,0));
		        process1.setColumns(20);
		        process1.setFont(new java.awt.Font("Batang", 1, 30)); // NOI18N
		        process1.setRows(5);
		        process1.setText("•\t먼저 질문과 이 프로젝트의 요구 사항을 분석하고 적절한 \r\n         구현 방법에 대해 생각했습니다.\r\n\r\n•\t그리고이 프로젝트에 대한 모든 구성원의 역할을 \r\n         결정했습니다.\r\n\r\n•\t그래서 우리는 이 프로젝트에 GUI와IO와 상속성을 \r\n         사용하기로 결정했습니다.\r\n");
		        process1.setOpaque(false);
		        process1.setBounds(780, 480, 1080, 490);

		        gif2.setIcon(new javax.swing.ImageIcon("ProjectData\\gifDngnTmmte.gif")); // NOI18N
		        gif2.setBounds(1250, 1190, 460, 258);

		        gif22.setIcon(new javax.swing.ImageIcon("ProjectData\\\\gifDngnTmmte2.gif")); // NOI18N
		        gif22.setBounds(1420, 1520, 460, 260);

		        gif23.setIcon(new javax.swing.ImageIcon("ProjectData\\gifDngnTmmte3.gif")); // NOI18N
		        gif23.setBounds(1240, 1840, 460, 250);

		        p2title.setBackground(new Color(0,0,0,0));
		        p2title.setColumns(20);
		        p2title.setFont(new java.awt.Font("Batang", 3, 48)); // NOI18N
		        p2title.setRows(5);
		        p2title.setText("팀웍은 핵심이다!");
		        p2title.setOpaque(false);
		        p2title.setBounds(730, 1280, 410, 60);

		        process2.setBackground(new Color(0,0,0,0));
		        process2.setColumns(20);
		        process2.setFont(new java.awt.Font("Batang", 1, 30)); // NOI18N
		        process2.setRows(5);
		        process2.setText("• 코드가 개발됐지만 몇몇 부분에 틀린 것이 있기 때문에 \r\n  코드에 다시 확인을 해서 고쳤습니다. \r\n\r\n• 그렇지만 다른 부분에 틀린을 것도 아직 고칠 수 없어서 \r\n  그 문제를 해소를 하도록 인터넷에서 정보를 찾아서 \r\n  참고했습니다. \r\n\r\n• 그 후에 단체로 논의하고 어떻게 문제 해소법을 함께 \r\n  생각했습니다.\r\n");
		        process2.setOpaque(false);
		        process2.setBounds(130, 1390, 1060, 630);

		        pic3.setIcon(new javax.swing.ImageIcon("ProjectData\\parks1.jpg")); // NOI18N
		        pic3.setBounds(140, 2270, 460, 340);

		        pic32.setIcon(new javax.swing.ImageIcon("ProjectData\\parks4.png")); // NOI18N
		        pic32.setBounds(40, 2670, 500, 380);

		        p3title.setBackground(new Color(0,0,0,0));
		        p3title.setColumns(20);
		        p3title.setFont(new java.awt.Font("Batang", 3, 48)); // NOI18N
		        p3title.setRows(5);
		        p3title.setText("전문가의 도움 :\r\n\r\n");
		        p3title.setOpaque(false);
		        p3title.setBounds(680, 2360, 410, 60);

		        process3.setBackground(new Color(0,0,0,0));
		        process3.setColumns(20);
		        process3.setFont(new java.awt.Font("Batang", 1, 30)); // NOI18N
		        process3.setRows(5);
		        process3.setText("• 그 코드는 계속 하다 보니까 더 에러는 생겼습니다. \r\n\r\n• 인터넷에서 참고를 찾아도 에러를 못 해결하기 \r\n  때문에 우리 선생님께 문제에 대해 질문을 했습니다. \r\n\r\n• 그 후에 코드를 다시 확인을 해서 코드는 고지고 \r\n   실행했습니다.\r\n");
		        process3.setOpaque(false);
		        process3.setBounds(660, 2460, 1190, 590);

		        gif4.setIcon(new javax.swing.ImageIcon("ProjectData\\gifDngnMember1.gif")); // NOI18N
		        gif4.setBounds(1280, 3360, 320, 220);

		        gif42.setIcon(new javax.swing.ImageIcon("ProjectData\\gifTeamL1.gif")); // NOI18N
		        gif42.setBounds(1440, 3660, 460, 260);

		        gif43.setIcon(new javax.swing.ImageIcon("ProjectData\\gifTeamL2.gif")); // NOI18N
		        gif43.setBounds(1210, 4000, 450, 260);

		        p4title.setBackground(new Color(0,0,0,0));
		        p4title.setColumns(20);
		        p4title.setFont(new java.awt.Font("Batang", 3, 48)); // NOI18N
		        p4title.setRows(5);
		        p4title.setText("깨지지 않는 우정 :");
		        p4title.setOpaque(false);
		        p4title.setBounds(810, 3470, 410, 60);

		        process4.setBackground(new Color(0,0,0,0));
		        process4.setColumns(20);
		        process4.setFont(new java.awt.Font("Batang", 1, 30)); // NOI18N
		        process4.setRows(5);
		        process4.setText("• 다른 그룹의 멤버와 함께 아무거나 모르는\r\n   것을 논의하고 문제에 대해서 해결했습니다.\r\n\r\n• 우리는 배경, 글, 그림을 놓아여 메인 페이지와\r\n  각 멤버의 탭을 디자인하기 시작했습니다.\r\n\r\n• 소감을 만든 후에 우리가 IO 메소드에 대한\r\n  코드에서 사용해 봤습니다.\r\n\r\n• .txt 파일을 멤버의 탭에서 출력하고 전시했습니다.\r\n");
		        process4.setOpaque(false);
		        process4.setBounds(160, 3560, 1010, 580);

		        gif5.setIcon(new javax.swing.ImageIcon("ProjectData\\gifEnd.gif")); // NOI18N
		        gif5.setBounds(40, 4570, 590, 340);

		        gif52.setIcon(new javax.swing.ImageIcon("ProjectData\\gifEnd2.gif")); // NOI18N
		        gif52.setBounds(330, 4930, 220, 290);

		        p5title.setBackground(new Color(0,0,0,0));
		        p5title.setColumns(20);
		        p5title.setFont(new java.awt.Font("Batang", 3, 48)); // NOI18N
		        p5title.setRows(5);
		        p5title.setText("수고했어 다들!!");
		        p5title.setOpaque(false);
		        p5title.setBounds(680, 4590, 410, 60);

		        process5.setBackground(new Color(0,0,0,0));
		        process5.setColumns(20);
		        process5.setFont(new java.awt.Font("Batang", 1, 30)); // NOI18N
		        process5.setRows(5);
		        process5.setText("• 드디어 우리 코드는 거의 완전했습니다.\r\n\r\n• 코드는 다시 확인하고 실행했습니다\r\n\r\n• 그리고 그래픽 디스프레이는 조직적으로\r\n   준비했습니다.\r\n\r\n• ppt 파일을 만들기 시작했고 UML을 \r\n        창조했습니다.\r\n\r\n• 마지막으로 우리가 같이 발표 대한 준비를 \r\n   했습니다.\r\n");
		        process5.setOpaque(false);
		        process5.setBounds(710, 4690, 1120, 510);

		        mainbg.add(title);
		        mainbg.add(p1title);
		        mainbg.add(p2title);
		        mainbg.add(p3title);
		        mainbg.add(p4title);
		        mainbg.add(p5title);
		        mainbg.add(process1);
		        mainbg.add(process2);
		        mainbg.add(process3);
		        mainbg.add(process4);
		        mainbg.add(process5);
		        mainbg.add(gif1);
		        mainbg.add(gif2);
		        mainbg.add(gif22);
		        mainbg.add(gif23);
		        mainbg.add(pic3);
		        mainbg.add(pic32);
		        mainbg.add(gif4);
		        mainbg.add(gif42);
		        mainbg.add(gif43);
		        mainbg.add(gif5);
		        mainbg.add(gif52);
		    }

	}

