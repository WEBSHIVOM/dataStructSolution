package designPattern.adapter;

import java.util.concurrent.atomic.AtomicInteger;

import javax.management.monitor.Monitor;

public class Test {
public static void main(String[] args) {
	Pen p= new PenAdapter();
	p.write("pen1");
	Pen p1=new PenAdapter();
	p1.write("PEN2");
	
	
}
}

class tes extends Monitor{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}
