package com.mba.game;

public class MultiPlayerGameFactory {
	
	 private MultiPlayerGameFactory(){};

	    public static MultiplayerGame createMatch() {
	        return new MultiplayerGame();
	    }
	    
}
