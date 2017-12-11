package com.kata_tennis.test;

import com.kata_tennis.service.Scorefinal;

import junit.framework.TestCase;

public class Scorefinaltest extends TestCase{

	Scorefinal scofi = new Scorefinal("player_1" , "player_2");
	
	int player_2 = 0;
	
	public void testNewScoreBall() throws Exception
	{
		String score = scofi.result();
		
		assertEquals("zero", score);
	}
	
	public void testFirstBall() throws Exception
	{
		scofi.firstplayerscoreInc();
		scofi.secondplayerscoreInc();

		String score = scofi.result();
		assertEquals("zero", score);		
	}
	
	public void testFifteenAll() throws Exception{
		scofi.firstplayerscoreInc();
		scofi.secondplayerscoreInc();
		
		String score = scofi.result();
		assertEquals("Fifteen all", score);
	}
	
	public void testThirtyAll() throws Exception{
		scofi.firstplayerscoreInc();
		scofi.secondplayerscoreInc();
		
		String score = scofi.result();
		assertEquals("Thirty all", score);
	}
	
	public void testFortyAll() throws Exception{
		scofi.firstplayerscoreInc();
		scofi.secondplayerscoreInc();
		
		String score = scofi.result();
		assertEquals("Forty all", score);
	}
	public void testplayer_2master() throws Exception {
		createScore(0, 2);
		
		String score = scofi.result();
		assertEquals("zero,Thirty", score);
	}
	
	public void testplayer_1master() throws Exception{
		createScore(3, 0);
		String score = scofi.result();
		assertEquals("Forty,zero", score);
	}
	
	public void testplayersareDeuce() throws Exception {
		createScore(3, 3);
		String score = scofi.result();
		assertEquals("Deuce", score);		
	}
	
	public void testplayer_1Adscore() throws Exception
	{
		createScore(4, 0);
		String score = scofi.result();
		assertEquals("player_1", score);
	}
	
	public void testPlayersAreDuce4() throws Exception {
		createScore(4, 4);
		String score = scofi.result();
		assertEquals("Deuce", score);		
	}

	public void testplayer_1Adscorega() throws Exception{
		createScore(5, 4);
		String score = scofi.result();
		assertEquals("Advantage player_1", score);
	}
	
	public void testplayer_1Afscore() throws Exception {
		createScore(8, 6);
		String score = scofi.result();
		assertEquals("Player_1 master", score);
	}
	
	private void createScore(int player_1, int player2) {
		for (int i = 0; i < player_1; i++) {
			scofi.firstplayerscoreInc();
		}
		for (int i = 0; i <player_2; i++) {
			scofi.secondplayerscoreInc();
		}
	}
}
