package concurrentHashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHahsmAPAS {

	public static void main(String[] args) {
		ConcurrentHashMap<StringBuffer, Integer> conc=new ConcurrentHashMap<StringBuffer, Integer>(400, (float) 1.01, 18);
		
		int x=0;
		for(int i=0;i<10;i++) {
			conc.put(new StringBuffer(x), Integer.valueOf(x));
			System.out.println("map"+conc);
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			x++;
		}
	}
}
