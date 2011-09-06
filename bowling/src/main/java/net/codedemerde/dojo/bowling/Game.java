package net.codedemerde.dojo.bowling;

public class Game {
	
	private int[] rolls = new int[21];
	private int currentRoll = 0;
	
	public void roll(int i) {
		rolls[currentRoll] += i;
		currentRoll++;
	}

	public int score() {
		int score = 0;
		int frameIndex = 0;
		
		for (int frame = 0; frame < 10; frame++) {
			if (isStrike(frameIndex)) {
				score += 10 + strikeBonus(frameIndex);
				frameIndex += 1;
			} else if (isSpare(frameIndex)) {
				score += 10 + spareBonus(frameIndex);
				frameIndex += 2;
			} else {
			  score += pinsDownInFrame(frameIndex);
			  frameIndex += 2;
			}
			
		}
		
		return score;
	}

	private int pinsDownInFrame(int frameIndex) {
		return rolls[frameIndex] + rolls[frameIndex+1];
	}

	private int strikeBonus(int frameIndex) {
		return rolls[frameIndex + 1] + rolls[frameIndex + 2];
	}

	private boolean isStrike(int frameIndex) {
		return rolls[frameIndex] == 10;
	}

	private boolean isSpare(int frameIndex) {
		return (rolls[frameIndex] + rolls[frameIndex+1]) == 10;
	}
	
	private int spareBonus(int frameIndex) {
		return rolls[frameIndex+2];
	}	
	
}
