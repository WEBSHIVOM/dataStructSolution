package designPatternFactory;

public class OSFactory {
  
	
	public Os getInstance(String s) {
		if(s.contains("Android")) {
			return new Androied();
		}else {
			return new Ios();
		}
	}
}
