package com.trello.Project.Genaricutility;

import java.time.LocalDateTime;

/**
 * This class provide Java Accessories to facilitate in building automation
 * Script
 * 
 * @author Lohith
 * 
 *
 */
public class JavaUtility {
	/**
	 * This class will provide unique filename of the ScreenShots
	 * 
	 * @return StringtimeStamp
	 * @author QASM6
	 */
	public String timeStamp() {

		String timeStamp = LocalDateTime.now().toString().replace(':', '-');

		return timeStamp;
	}


}
