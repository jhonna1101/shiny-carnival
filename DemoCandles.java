package com.cpe50;

public class DemoCandles {
	public static String ccolor, cscent;
	public static int cheight;
	public static double cprice;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ScentedCandle c = new ScentedCandle("Pink", 3, "Vanilla" );
	c.setColor("Blue");
	c.setHeight(2);
	c.setScent("Floral Mist");
	System.out.println(c);
	System.out.println(c.getPrice());
	
	Candle cc = new Candle("Lavender", 5);
	cc.setColor("Green");
	cc.setHeight(3);
	System.out.println(cc);
	System.out.println(cc.getPrice());
	

	}

}
