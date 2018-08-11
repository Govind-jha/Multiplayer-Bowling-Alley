package com.mba.game.scoreboard;

import java.util.Arrays;

import com.mba.config.AppConstants;
import com.mba.game.bonus.BonusStrategy;
import com.mba.game.bonus.DefaultBonusStrategy;

public class BowlingGameScoreBoardImpl implements BowlingGameScoreBoard {

	private int[] rolls;
	private Integer currentRoll;

	private BonusStrategy bonusStrategy;

	public BowlingGameScoreBoardImpl() {
		this.currentRoll = 0;
		this.rolls = new int[AppConstants.MAX_ROLLS];
		this.bonusStrategy = new DefaultBonusStrategy();
	}

	public void roll(Integer p) {
		if (currentRoll == AppConstants.MAX_ROLLS - 1 && (rolls[currentRoll - 1] + rolls[currentRoll - 2] > 9)) {
			return;
		}

		rolls[currentRoll++] = p;
	}

	public Integer score() {
		int score = 0;
		int frame = 0;

		for (int i = 0; i < 10; i++) {
			int tempScore = 0;

			if (isStrike(frame)) {
				tempScore = 10 + bonusStrategy.strikeBonus();
				score += tempScore;
				frame += 2;
			} else if (isSpare(frame)) {
				tempScore = 10 + bonusStrategy.spareBonus();
				score += tempScore;
				frame += 2;
			} else {
				tempScore = sumOfRolls(frame);
				score += tempScore;
				frame += 2;
			}

		}

		return score + rolls[frame];
	}

	private boolean isStrike(int frame) {
		return rolls[frame] == 10;
	}

	private boolean isSpare(int frame) {
		return sumOfRolls(frame) == 10;
	}

	private int sumOfRolls(int frame) {
		return rolls[frame] + rolls[frame + 1];
	}

	public int[] getRolls() {
		return rolls;
	}

	public String getBonusStrategy() {
		return bonusStrategy.getStartegyName();
	}

	public void setBonusStrategy(BonusStrategy bonusStrategy) {
		this.bonusStrategy = bonusStrategy;
	}

	@Override
	public String toString() {
		return "BowlingGameScoreBoardImpl [bonusStrategy=" + bonusStrategy.getStartegyName() + ", rolls="
				+ Arrays.toString(rolls) + ", currentRoll=" + currentRoll + "]";
	}

}