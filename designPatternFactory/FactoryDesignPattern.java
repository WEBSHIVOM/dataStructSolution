package designPatternFactory;

public class FactoryDesignPattern {
public static void main(String[] args) {
		/*
		 * Os obj= new Ios(); obj.show();
		 */
	OSFactory factory= new OSFactory();
	Os ss= factory.getInstance("android");
	ss.show();
	
}
}
