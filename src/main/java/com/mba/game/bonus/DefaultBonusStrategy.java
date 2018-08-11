package com.mba.game.bonus;

import com.mba.config.AppConstants;

public class DefaultBonusStrategy implements BonusStrategy {

	@Override
	public int strikeBonus() {
		return AppConstants.STRIKE_BONUS;
	}

	@Override
	public int spareBonus() {
		return AppConstants.SPARE_BONUS;
	}

	@Override
	public String getStartegyName() {
		return "DEFAULT";
	}

}
