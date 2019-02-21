package problem04;

import java.io.FileReader;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		Random ran = new Random();
		
		int done = 0;
		int chal = 1;
		
		String bridge = "";
		char[] brid = {'#', 'O'};
		
		
		
		for(int i=0; i<20; i++) {
			int j = ran.nextInt(2);
			bridge += brid[j];
		}
		System.out.println(bridge);
		
		int where = 0;
		
		do  {
			int ju = ran.nextInt(5);
			where += ju;
			
			if (where>19) {
				done = 1; 
				break;
			}
			if (bridge.charAt(where) == '#') {
				
			}
		} while (where <= 19);
		
		
		FileReader fr = new FileReader("");
	}

}
