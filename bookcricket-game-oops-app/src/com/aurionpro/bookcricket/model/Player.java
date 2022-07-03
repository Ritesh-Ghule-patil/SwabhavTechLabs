package com.aurionpro.bookcricket.model;

public class Player {

	private final String playerName;
	private int score;
	private int rounds;
	
	public Player(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

//	public void setPlayerName(String playerName) {
//		this.playerName = playerName;
//	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", score=" + score + ", rounds=" + rounds + "]";
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

}
