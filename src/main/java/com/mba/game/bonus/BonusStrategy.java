package com.mba.game.bonus;

public interface BonusStrategy {
	
	String getStartegyName();
	
	int strikeBonus();

	int spareBonus();
}
