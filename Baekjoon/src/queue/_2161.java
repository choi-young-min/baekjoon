package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _2161 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 1; i <= N; i++) {
			queue.offer(i);
		}
		
		while(queue.size() > 1) {
			sb.append(queue.poll()).append(" ");
			int pop = queue.poll();
			queue.add(pop);
		}
		sb.append(queue.poll());
		System.out.println(sb);
	}
}
