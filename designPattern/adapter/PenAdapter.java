package designPattern.adapter;

public class PenAdapter implements Pen {

	PilotPen pilot= new PilotPen();
	@Override
	public void write(String data) {
		pilot.write(data);
		
	}

}
