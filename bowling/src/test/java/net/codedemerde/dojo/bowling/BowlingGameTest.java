package net.codedemerde.dojo.bowling;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

	private Game game;

	@Before
	public void setUp() {
		game = new Game();
	}

	private void rollMany(int numberOfRolls, int pins) {
		for (int i = 0; i < numberOfRolls; i++) {
			game.roll(pins);
		}
	}

	@Test
	public void testNullGame() {
		rollMany(20, 0);

		assertEquals(0, game.score());
	}

	@Test
	public void testAllOne() {
		rollMany(20, 1);

		assertEquals(20, game.score());
	}
	
	@Test
	public void testOneSpare() {
		rollSpare();
		
		game.roll(2);
		
		rollMany(17, 0);
		
		assertEquals(14, game.score());
	}

	@Test
	public void testOneStrike() {
		game.roll(10);
		game.roll(2);
		game.roll(2);
		
		rollMany(16, 0);
		
		assertEquals(18, game.score());
	}
	
	@Test public void testPerfectGame() {
		rollMany(10, 10);
		game.roll(10);
		game.roll(10);
		
		assertEquals(300, game.score());
	}
	private void rollSpare() {
		game.roll(5);
		game.roll(5);
	}
}
