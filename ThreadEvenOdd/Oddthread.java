package threadEvenodd;

import java.util.concurrent.atomic.AtomicInteger;

public class Oddthread implements Runnable {
   private AtomicInteger val;
   
   Oddthread(AtomicInteger xx){
	   this.val=xx;
   }
	@Override
	public void run() {
		
		synchronized (this) {
			if (val.get() % 2 != 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
		System.out.println(Thread.currentThread().getName() + " --------------->>>>>>>" + val.get());
		val.incrementAndGet();
		notify();
	}

}
