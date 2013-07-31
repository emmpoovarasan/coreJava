package com.tutorialspoint.loopcontrols;

public abstract class LoopControls{

	public abstract void printLoopControls(String loopName);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileLoop wl = new WhileLoop();
		wl.printLoopControls("While Loop");
		System.out.println("\n-------------------------------\n");
		
		DoWhileLoop dwl = new DoWhileLoop();
		dwl.printLoopControls("Do While Loop");
		System.out.println("\n-------------------------------\n");
		
		ForLoop fl = new ForLoop();
		fl.printLoopControls("For Loop");
		System.out.println("\n-------------------------------\n");
		
		EnhancedForLoop efl = new EnhancedForLoop();
		efl.printLoopControls("Enhanced For Loop");
		System.out.println("\n-------------------------------\n");
		
		BreakStatementInLoop bsil = new BreakStatementInLoop();
		bsil.printLoopControls("Break Statement In Loops");
		System.out.println("\n-------------------------------\n");
		
		ContinueStatementInLoop csil = new ContinueStatementInLoop();
		csil.printLoopControls("Continue Statement In Loops");
		System.out.println("\n-------------------------------\n");
	}

}
class WhileLoop extends LoopControls{
	@Override
	public void printLoopControls(String loopName) {
		// TODO Auto-generated method stub
		int x=0;
		while (x < 5){
			x=x+1;
			System.out.println(loopName+" : X of "+x);
		}
	}
}
class DoWhileLoop extends LoopControls{
	@Override
	public void printLoopControls(String loopName) {
		// TODO Auto-generated method stub
		int x=6;
		do{
			System.out.println(loopName+" : X of "+x);
			x=x+1;
		}while(x < 11);
	}
}
class ForLoop extends LoopControls{
	@Override
	public void printLoopControls(String loopName) {
		// TODO Auto-generated method stub
		for(int x = 11; x < 16; x++){
			System.out.println(loopName+" : X of "+x);
		}
	}
}
class EnhancedForLoop extends LoopControls{

	@Override
	public void printLoopControls(String loopName) {
		// TODO Auto-generated method stub
		int[] numbers = {16,17,18,19,20};
		for(int x : numbers){
			System.out.println(loopName+" : X of "+x);
		}
		
		String[] names = {"Poovarasan", "Nithya", "Santhosh"};
		for(String name : names){
			System.out.print(loopName+" : Name of "+name+",");
		}
		
	}
}
class BreakStatementInLoop extends LoopControls{
	@Override
	public void printLoopControls(String loopName) {
		// TODO Auto-generated method stub
		int[] numbers = {21,22,23,24,25};
		for(int x : numbers){
			if(x == 23){
				break;
			}
			System.out.println(loopName+" : X of "+x);
		}
	}
}
class ContinueStatementInLoop extends LoopControls{
	@Override
	public void printLoopControls(String loopName) {
		// TODO Auto-generated method stub
		int[] numbers = {26,27,28,29,30};
		for(int x : numbers){
			if(x == 28){
				continue;
			}
			System.out.println(loopName+" : X of "+x);
		}
	}
}