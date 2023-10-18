package Week1.Day1;

import java.util.Iterator;

public class Fibononacci {
	public static void main(String[] args) {
		int range=8, firstnum=0, secondnum=1, sum;
		
		System.out.println(firstnum);
		System.out.println(secondnum);
		for (int i = 0; i <=8; i++) {
			sum = firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			System.out.println(sum);
		}
	}

}