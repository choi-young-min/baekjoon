package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sticks = br.readLine();
		
		int open = 0;
		int answer = 0;
		
		for(int i = 0; i < sticks.length(); i++) {
			char stick = sticks.charAt(i);
			if(stick == '(') {
				open++;
			} else {
				open--;
				
				if(sticks.charAt(i - 1) == '(') {
					answer += open;
				} else {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
