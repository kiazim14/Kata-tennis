package com.kata_tennis.service;

public class Scorefinal {
	
	private String firstplayername = null;
	private String secondplayername = null;
	private int firstplayerscore = 0;
	private int secondplayerscore= 0;
	;
	
	
	public Scorefinal(String firstplayername, String secondplayername) {
		this.firstplayername = firstplayername;
		this.secondplayername = secondplayername;
	}
	
	public String playermaster() {
		if (firstplayerscore > secondplayerscore) {
			return firstplayername;
		} else {
			return secondplayername;
		}
	}
	
	public String result() throws Exception {
		if (wasMaster()) {
			return playermaster() + "mast";
		}
		
		if (areAdvantage()) { 
			return "Advantage " + playermaster(); 
		}
		
		if (areDeuce())
			return "Deuce";
		
		if(firstplayerscore == secondplayerscore) {
			return tennisScore(firstplayerscore) + " all";
		}
		
		return tennisScore(firstplayerscore) + "," + tennisScore(secondplayerscore);
}

	
	private String tennisScore(int scoreResult) throws Exception {
		switch (scoreResult) {
		case 0:
			return "zero";
		case 1: 
			return "Fifteen";
		case 2:
			return "Thirty";
		case 3:
			return "Forty";
		}
		throw new Exception("wrong score: " + scoreResult);
	}
	
	public void firstplayerscoreInc() {
		firstplayerscore++;
	}

	public void secondplayerscoreInc() {
		secondplayerscore++;
	}

	private boolean areDeuce() {
		return firstplayerscore >= 3 && secondplayerscore == firstplayerscore;
	}

	private boolean areAdvantage() {
		if (secondplayerscore >= 4 && secondplayerscore == firstplayerscore + 1)
			return true;
		if (firstplayerscore >= 4 && firstplayerscore == secondplayerscore + 1)
			return true;
		
		return false;
	}

	private boolean wasMaster() {
		if(secondplayerscore >= 4 && secondplayerscore >= firstplayerscore + 2 )
			return true;
		if(firstplayerscore >= 4 && firstplayerscore >= secondplayerscore + 2)
			return true;
		return false;
}
}