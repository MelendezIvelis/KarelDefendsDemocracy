package week1;

import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				fixVote();
			}
			move();
		}
	}

	/* Karel checks the corners of the ballot for any lingering chads */

	private void fixVote() {
		turnRight();
		removeChad();
		removeChad();
		turnLeft();
	}

	/* Karel picks up any present beepers */

	private void removeChad() {
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
	}
}