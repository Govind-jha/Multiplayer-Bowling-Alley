package com.mba.model;

import com.mba.game.scoreboard.BowlingGameScoreBoard;
import com.mba.game.scoreboard.BowlingGameScoreBoardImpl;

public class Player {

	private String name;
	private BowlingGameScoreBoard game;

	public Player(String name) {
		this.name = name;
		this.game = new BowlingGameScoreBoardImpl();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BowlingGameScoreBoard getGame() {
		return game;
	}

	public void setGame(BowlingGameScoreBoard game) {
		this.game = game;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", game=" + game + "]";
	}

}
