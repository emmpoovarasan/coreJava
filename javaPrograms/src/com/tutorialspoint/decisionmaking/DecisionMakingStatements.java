package com.tutorialspoint.decisionmaking;

public abstract class DecisionMakingStatements {
protected abstract void printDecisionMaking(String decisionName);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfClass ic = new IfClass();
		ic.printDecisionMaking("Simple IF Statement");
		System.out.println("-----------------------------");
		
		IfElseClass iec = new IfElseClass();
		iec.printDecisionMaking("If Else Statement");
		System.out.println("-----------------------------");
		
		IfElseIfElseClass ieiec = new IfElseIfElseClass();
		ieiec.printDecisionMaking("If Else If Else");
		System.out.println("-----------------------------");
		
		NestedIfElseClass niec = new NestedIfElseClass();
		niec.printDecisionMaking("Nested If Else Statement");
		System.out.println("-----------------------------");
		
		SwitchClass sc = new SwitchClass();
		sc.printDecisionMaking("Switch Statement");
	}

}
class IfClass extends DecisionMakingStatements{

	@Override
	protected void printDecisionMaking(String decisionName) {
		// TODO Auto-generated method stub
		int x = 10;
		if(x < 20){
			System.out.println(decisionName+" value of X(x < 20) is "+x);
		}
	}
}
class IfElseClass extends DecisionMakingStatements{
	@Override
	protected void printDecisionMaking(String decisionName) {
		// TODO Auto-generated method stub
		int x = 30;
		if(x < 20){
			System.out.println(decisionName+" is less than value of X(x < 20) is "+x);
		}else{
			System.out.println(decisionName+" is greater than value of X(x < 20) is "+x);
		}
	}
}
class IfElseIfElseClass extends DecisionMakingStatements{
	@Override
	protected void printDecisionMaking(String decisionName) {
		// TODO Auto-generated method stub
		int x = 30;
		if(x == 10){
			System.out.println(decisionName +" value of X(x == 10) is "+ x );
		}else if(x == 20){
			System.out.println(decisionName +" value of X(x == 20) is "+ x );
		}else if(x == 30){
			System.out.println(decisionName +" value of X(x == 30) is "+ x );
		}else{
			System.out.println(decisionName +" value of X(x == 30) is default is "+ x );
		}
	}
}
class NestedIfElseClass extends DecisionMakingStatements{
	@Override
	protected void printDecisionMaking(String decisionName) {
		// TODO Auto-generated method stub
		int x = 30;
		int y = 20;
		if(x == 30){
			if(y==20){
				System.out.println(decisionName+" values of X(x == 30) is "+x +" and vlaue of Y(y==20) is "+y);
			}
		}
	}
}
class SwitchClass extends DecisionMakingStatements{
	@Override
	protected void printDecisionMaking(String decisionName) {
		// TODO Auto-generated method stub
	char grade = 'C';	
	switch (grade) {
	case 'A':
		System.out.println(decisionName+" Excellent! "+grade);
		break;
	case 'B':
	case 'C':
		System.out.println(decisionName+" Well done!! "+grade);
		break;
	case 'D':
		System.out.println(decisionName+" You Passed!!! "+grade);
	case 'E':
		System.out.println(decisionName+" Better try again!!!! "+grade);
		break;
	default:
		System.out.println(decisionName+" Invalid Grade!!!!! "+grade);
		//break;
	}
	System.out.println(decisionName+" Your grade is "+grade);
	}
}