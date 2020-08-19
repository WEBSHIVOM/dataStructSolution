package designPattern.builder;

import designPattern.builder.ClassIc.ClassIcBuilder;

public class TestBuider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ClassIc classIc=new ClassIcBuilder().gid("SAdsad").id("SADSAD").build();
  classIc.getGid();
	}

}
