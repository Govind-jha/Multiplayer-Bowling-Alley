package com.mba.app;

import com.mba.game.MultiPlayerGameFactory;
import com.mba.game.MultiplayerGame;
import com.mba.model.Player;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Player p1 = new Player("Sam");
    	Player p2 = new Player("Bunny");
    	MultiplayerGame game = MultiPlayerGameFactory.createMatch();
    	
    	game.addPlayer(p1);
    	game.addPlayer(p2);
    	
    	Player winner = game.start();
    	
    	System.out.println(game.getPlayer(0));
    	System.out.println(game.getPlayer(1));

    	System.out.println();
    	
    	System.out.println(winner);
    	
    }
}
