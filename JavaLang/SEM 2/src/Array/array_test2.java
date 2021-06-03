package Array;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

//ì–´ë–¤ ì‹œìŠ¤íƒ¬ì�˜ ë¡œê·¸ì�¸ì�„ êµ¬í˜„í•˜ëŠ” í”„ë¡œê·¸ëž¨ ìž‘ì„±í•˜ë�˜ íšŒì›�ì�˜ ì•„ì�´ë”” 5ê°œì™€ íšŒì›�ì�˜ ë¹„ë°€ë²ˆí˜¸ 5ê°œë¥¼ ë¬¸ìž�ì—´ë¡œ ê°�ê°�
//ì €ìž¥í•  ìˆ˜ ìžˆë�„ë¡� í•˜ê³  í”„ë¡¬í”„íŠ¸ì°½ì�„ í†µí•´ ì•„ì�´ë””ì™€ ë¹„ë°€ë²ˆí˜¸ ìž…ë ¥ ë°›ì•„ ë¡œê·¸ì�¸ ì„±ê³µí•˜ë©´ "ìž‘ì„±ì �ìœ¼ë¡œ
//ë¡œê·¸ì�¸ë�˜ì—ˆìŠ´ë‹ˆë‹¤"ë¥¼ ì¶œë ¥í•˜ê³  ë¡œê·¸ì�¸ì�´ ì‹¤íŒ¨í•˜ë©´ "ì•„ì�´ë””ë‚˜ ë¹„ë°€ë²ˆí˜¸ê°€ ì�¼ì¹˜í•˜ê¸° ì•ŠìŠµë‹ˆë‹¤"ë¥¼
//ì¶œë ¥í•˜ë�„ë¡� ìž‘ì„±í•˜ì‹œì˜¤.

public class array_test2 {
	 public static void main (String[]args) {
		 //String id = "hong";
		 //boolean result = "hong".equals(id);
		 //System.out.println(result);
		 
		 String[][] member = { {"Kim", "Lee", "Park", "Kang", "Hong"}, {"K123", "L234", "P345", "K456", "H567"} };
		 Scanner input = new Scanner("System.in");
		 System.out.println("enter name:");
		 String id = input.nextLine();
		 System.out.println("enter pass:");
		 String pw = input.nextLine();
		 
		 boolean result=false;
		 
		 for (int r = 0; r<member.length;r++) {
			 for(int c = 0; c<member[r].length; c++) {
				 
				 if(id.equals(member[r][c]) && pw.equals(member[r+1][c])) {result=true;}
				 
				 }
			 
			 if(result) {
					 System.out.println("ìž‘ì„±ì �ìœ¼ë¡œ ë¡œê·¸ì�¸ ë�˜ì—ˆìŠµë‹ˆë‹¤");
			}else {
					 System.out.println("ì•„ì�´ë””ë‚˜ ë¹„ë°€ë²ˆí˜¸ê°€ ì�¼ì¹˜í•˜ì§€ ì•ŠìŠµë‹ˆë‹¤");
				 }
					     
				 }
			 }
		 }

