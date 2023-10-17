package com.jack;

public class Solu {

	public static void main(String[] args) {
		Smith s= new Smith();
		Thread t1=new Thread(s);
		t1.setName("Smith");
		
		Jack j= new Jack();
		Thread t=new Thread(j);
		t.setName("jack");
		t.setPriority(6);
		
		t1.start();
		t.start();
	


	}

}
