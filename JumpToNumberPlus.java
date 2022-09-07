import java.awt.*;
import java.awt.event.*;

public class JumpToNumberPlus {

	public static void main(String[] args) throws AWTException {
		Robot bot = new Robot();
		int jumpCount = 1000;
		int totalTime = 0;
		System.out.println("Starting Program! Please wait 5 seconds.");

		bot.delay(5000);

		System.out.println("Starting jumping");
		for (int i = 1; i < jumpCount; i++) {
			System.out.println("Jump: " + i);
			bot.delay(50);
			totalTime = spaceJump(bot, totalTime);
			int waitTime = (int)(Math.random()*60000 - 15000) + 15000;
			totalTime = totalTime + waitTime;
			System.out.println("Sleeping " + waitTime + " miliseconds. Total: " + totalTime + " in miliseconds. Time in hours:minutes; " + (totalTime/3600000.0) + ":" + (totalTime/60000));
			bot.delay(50);
			bot.delay(waitTime);
		}

		Toolkit.getDefaultToolkit().beep();
		System.out.println("Program is all done!");

	}
	
	public static int spaceJump(Robot bot, int totalTime) {
		int waitTime = (int)(Math.random()*15000 - 5000) + 5000;
		totalTime = totalTime + waitTime;
		System.out.println("\tfor " + waitTime);
		bot.keyPress(KeyEvent.VK_SPACE);
		bot.delay(waitTime);
//		bot.delay(50);
		bot.keyRelease(KeyEvent.VK_SPACE);
		return totalTime;
	}
	
}
