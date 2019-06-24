/**
 * 
 */
package bowling;

public class Game {

	public void add(int pins) {
		itsScorer.addThrow(pins);
		adjustCurrentFrame(pins);
	}

	public int score() {
		return scoreForFrame(itsCurrentFrame);
	}

	public int scoreForFrame(int theFrame) {
		return itsScorer.scoreForFrame(theFrame);
	}
	
	private void adjustCurrentFrame(int pins) {
		if (lastBallInFrame(pins)) {
			advanceFrame();
		} else {
			firstThrowInFrame = false;
		}
	}
	
	private boolean lastBallInFrame(int pins) {
		return strike(pins) || !firstThrowInFrame;
	}
	
	private boolean strike(int pins) {
		return firstThrowInFrame && pins == 10;
	}

	private void advanceFrame() {
		itsCurrentFrame = Math.min(10, itsCurrentFrame+1);
	}
	public int getCurrentFrame() {
		return itsCurrentFrame;
	}
	
	private int itsCurrentFrame = 0;
	private boolean firstThrowInFrame = true;
	public Score itsScorer = new Score();
}