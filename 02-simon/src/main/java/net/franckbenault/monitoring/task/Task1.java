package net.franckbenault.monitoring.task;

import org.javasimon.SimonManager;
import org.javasimon.Split;
import org.javasimon.Stopwatch;


public class Task1 {

	private static Stopwatch stopwatch = 
			SimonManager.getStopwatch("Hierarchy.task1");
	
	public void run() {
		Split split = stopwatch.start();
		String s= "";
		for(int i=0; i<100; i++) {
			s=s+i;
		}
		split.stop();
	}

}
