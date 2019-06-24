/**
 * 
 */
package bowling;

import junit.framework.TestCase;

public class TestGame extends TestCase {

	private Game g;
	
	public TestGame(String game) {
		super(game);
	}
	
	@Override
	protected void setUp() throws Exception {
		g = new Game();
	}
	
//	public void testOneThrow() {
//		g.add(5);
//		assertEquals(5, g.score());
//		assertEquals(1, g.getCurrentFrame());
//	}
	
	public void testTwoThrowsNoMark() {
		g.add(5);
		g.add(4);
		assertEquals(9, g.score());
	}
	
	public void testFourThrowsNoMark() {
		g.add(5);
		g.add(4);
		g.add(7);
		g.add(2);
		assertEquals(18, g.score());
		assertEquals(9, g.scoreForFrame(1));
		assertEquals(18, g.scoreForFrame(2));
	}
	
	public void testSimpleSpare() {
		g.add(3);
		g.add(7);
		g.add(3);
		assertEquals(13, g.scoreForFrame(1));
	}
	
	public void testSimpleFrameAfterSpare() {
		g.add(3);
		g.add(7);
		g.add(3);
		g.add(2);
		assertEquals(13, g.scoreForFrame(1));
		assertEquals(18, g.scoreForFrame(2));
		assertEquals(18, g.score());
	}
	
	public void testSimpleStrike() {
		g.add(10);
		g.add(3);
		g.add(6);
	    assertEquals(19, g.scoreForFrame(1));
	    assertEquals(28, g.score());
	}
	
	public void testPerfectGame() {
		for(int i=0;i<12;i++) {
			g.add(10);
		}
		assertEquals(300, g.score());
	}
}