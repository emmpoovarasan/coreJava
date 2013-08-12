package com.tutorialspoint.interfaces;


public class TestMultipleInterface implements Football, Hockey {
	public String homeTeamName;
	public String visitingTeamName;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMultipleInterface tmi = new TestMultipleInterface();
		tmi.setHomeTeam("CSK");
		tmi.setVisitingTeam("MI");
		
		System.out.println("Home team name : "+tmi.getHomeTeamName());
		System.out.println("Visiting team name : "+tmi.getVisitingTeamName());
		
		tmi.homeTeamScored(4);
		tmi.visitingTeamScored(3);
		tmi.endOfQuarter(4);
		
		tmi.homeGoalScored();
		tmi.visitingGoalScored();
		tmi.endOfPeriod(1);
		tmi.overtimePeriod(20);
		
		
	}

	@Override
	public void setHomeTeam(String name) {
		// TODO Auto-generated method stub
		this.homeTeamName = name;
	}

	@Override
	public void setVisitingTeam(String name) {
		// TODO Auto-generated method stub
		this.visitingTeamName = name;
	}

	@Override
	public void homeGoalScored() {
		// TODO Auto-generated method stub
		System.out.println(this.getHomeTeamName()+" homeGoalScored() : "+4);
	}

	@Override
	public void visitingGoalScored() {
		// TODO Auto-generated method stub
		System.out.println(this.getVisitingTeamName() + " visitingGoalScored() : "+3);
	}

	@Override
	public void endOfPeriod(int period) {
		// TODO Auto-generated method stub
		System.out.println("endOfPeriod(int period) : "+ period + " hour");
	}

	@Override
	public void overtimePeriod(int ot) {
		// TODO Auto-generated method stub
		System.out.println("overtimePeriod(int ot) : "+ ot +" minutes");
	}

	@Override
	public void homeTeamScored(int points) {
		// TODO Auto-generated method stub
		System.out.println(this.getHomeTeamName()+ " homeTeamScored(int points)" + points);
		
	}

	@Override
	public void visitingTeamScored(int points) {
		// TODO Auto-generated method stub
		System.out.println(this.getVisitingTeamName()+ " visitingTeamScored(int points) : "+ points);
	}

	@Override
	public void endOfQuarter(int quarter) {
		// TODO Auto-generated method stub
		System.out.println("endOfQuarter(int quarter) : "+ quarter);
	}

	@Override
	public String getHomeTeamName() {
		// TODO Auto-generated method stub
		return this.homeTeamName;
	}

	@Override
	public String getVisitingTeamName() {
		// TODO Auto-generated method stub
		return this.visitingTeamName;
	}


}
