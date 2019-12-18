package com.classcast;
interface Animal{
	void shout();


}
class LaoHu implements Animal{

	@Override
	public void shout() {
		System.out.println("aow·······");
		
	}

	public void eatMan() {
		System.out.println("老虎要吃人");
		
	}
	
	
}
public class tiger {

	public static void main(String[] args) {
		/*Animal a=new LaoHu();
		a.shout();
		((LaoHu)a).eatMan();*/
		Animal an1=new Pig();
	if(an1 instanceof LaoHu) {
		Animal b=new LaoHu();
		b.shout();
		((LaoHu)b).eatMan();
	}
	else {
		System.out.println("这个动物不是老虎");
	}
	}
	
}
class Pig implements Animal{

	@Override
	public void shout() {
		System.out.println("henheng···");
		
	}
	
}
