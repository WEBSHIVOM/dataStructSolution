package designPattern.adapter;

public class PilotPen {
	
	private final static String colour="black";
	private final static String material="thermo";
	
	void write(String s){
		System.out.println(s+"__"+colour+"___"+material);
	}

}
